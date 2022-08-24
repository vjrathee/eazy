package org.brainypeople.eazy.dao;

import org.brainypeople.eazy.dao.rowmapper.EmployeeRowMapper;
import org.brainypeople.eazy.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Component
public class EmployeeDao {

    @Autowired
    JdbcTemplate jt;
    @Autowired
    NamedParameterJdbcTemplate npjt;

    public boolean isEmailExist(String email) {
        String query = "select id from employee where email = :email";


        MapSqlParameterSource sqlParams = new MapSqlParameterSource();
        sqlParams.addValue("email", email);


        List list = npjt.queryForList(query, sqlParams);


        return list.size() > 0;
    }

    public boolean isEmailExist(String email, Integer id) {
        String query = "select id from employee where email = :email and id<>:id";


        MapSqlParameterSource sqlParams = new MapSqlParameterSource();
        sqlParams.addValue("email", email);
        sqlParams.addValue("id", id);


        List list = npjt.queryForList(query, sqlParams);


        return list.size() > 0;
    }


    public Integer addEmployee(Map<String, Object> params, List<String> errors) {
        KeyHolder holder = new GeneratedKeyHolder();
        try {
            Employee employee = (Employee) params.get("employee");
            String query = "insert into employee (firstName,lastName,email,age) values " +
                    " ( :firstName,:lastName,:email,:age)";


            MapSqlParameterSource sqlParams = new MapSqlParameterSource();
            sqlParams.addValue("firstName", employee.getFirstName());
            sqlParams.addValue("lastName", employee.getLastName());
            sqlParams.addValue("email", employee.getEmail());
            sqlParams.addValue("age", employee.getAge());


            npjt.update(query, sqlParams, holder);
        } catch (Exception ex) {
            ex.printStackTrace();
            errors.add(ex.getMessage());
            errors.add(" there is some exception while adding Employee");
            return null;
        }

        return holder.getKey().intValue();

    }
@Transactional
    public Integer updateEmployee(Map<String, Object> params, List<String> errors) {

        Employee employee = (Employee) params.get("employee");
        String query = "update employee set firstName = :firstName,lastName = :lastName, email = :email, age = :age where id = :id";
        MapSqlParameterSource sqlParams = new MapSqlParameterSource();
        sqlParams.addValue("firstName", employee.getFirstName());
        sqlParams.addValue("lastName", employee.getLastName());
        sqlParams.addValue("email", employee.getEmail());
        sqlParams.addValue("age", employee.getAge());
        sqlParams.addValue("id", employee.getId());
        npjt.update(query, sqlParams);
        return employee.getId();

    }

    public List<Employee> getEmployee(Map<String, Object> params, List<String> errors) {
        MapSqlParameterSource sqlParams = new MapSqlParameterSource();

        StringBuilder query = new StringBuilder("select * from employee  where 1=1 ");
        if (params.get("id") != null) {
            query.append(" and id = :id");
            sqlParams.addValue("id", params.get("id").toString());
        }
        if (params.get("firstName") != null) {
            // query.append(" and firstName like '%"+params.get("firstName").toString()+"%'  ");
            query.append(" and firstName like '%").append(params.get("firstName").toString()).append("%' ");

        }

        if (params.get("lastName") != null) {
            // query.append(" and firstName like '%"+params.get("firstName").toString()+"%'  ");
            query.append(" and lastName like '%").append(params.get("lastName").toString()).append("%' ");

        }
        if (params.get("email") != null) {
            // query.append(" and firstName like '%"+params.get("firstName").toString()+"%'  ");
            query.append(" and email like '%").append(params.get("email").toString()).append("%' ");

        }
        System.out.println(" Query :::: "+query);
        List<Employee> employees = npjt.query(query.toString(), sqlParams, new EmployeeRowMapper());
        return employees;
    }
}
