package org.brainypeople.eazy.dao.rowmapper;

import org.brainypeople.eazy.model.Employee;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeRowMapper implements RowMapper<Employee> {


    @Override
    public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
        Employee ele = new Employee();
        ele.setAge(rs.getInt("age"));
        ele.setFirstName(rs.getString("firstName"));
        ele.setLastName(rs.getString("lastName"));
        ele.setEmail(rs.getString("email"));
        ele.setId(rs.getInt("id"));
        return ele;
    }
}
