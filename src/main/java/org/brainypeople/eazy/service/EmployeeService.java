package org.brainypeople.eazy.service;

import org.brainypeople.eazy.dao.EmployeeDao;
import org.brainypeople.eazy.model.Employee;
import org.brainypeople.eazy.response.Response;
import org.brainypeople.eazy.validator.EmployeeValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class EmployeeService {
    @Autowired
    EmployeeDao dao;

    @Autowired
    EmployeeValidator validator;

    public Response addEmployeeService(Map<String, Object> params) {
    List<String> errors = new ArrayList<String>();
    Response response = new Response();
    if(!validator.validateEmployee(params,errors))
    {
        response.setStatusMessage("Error while adding Employee");
        response.setErrorMessage(errors);
        return response;
    }

    Integer id = dao.addEmployee(params,errors);

    response.setId(id);
    if(errors.size()==0)
    response.setStatusMessage(" Employee Added succesfully");
    else
        response.setStatusMessage("Error while adding Employee");


    response.setErrorMessage(errors);
        return response;
    }

    public Response updateEmployee(Map<String, Object> params) {

        List<String> errors = new ArrayList<String>();
        Response response = new Response();
        if(!validator.validateEmployee(params,errors))
        {
            response.setStatusMessage("Error while updating Employee");
            response.setErrorMessage(errors);
            return response;
        }

        Integer id = dao.updateEmployee(params,errors);

        response.setId(id);
        if(errors.size()==0)
            response.setStatusMessage(" Employee updated succesfully");
        else
            response.setStatusMessage("Error while updating Employee");


        response.setErrorMessage(errors);
        return response;
    }

    public Response getEmployees(Map<String, Object> params) {

        List<String> errors = new ArrayList<String>();
        Response response = new Response();
//        if(!validator.validateEmployee(params,errors))
//        {
//            response.setStatusMessage("Error while updating Employee");
//            response.setErrorMessage(errors);
//            return response;
//        }

        List<Employee> employeeList = dao.getEmployee(params,errors);
        response.setStatusMessage("Employees fetched Succesfully");
        response.setErrorMessage(errors);
        response.setData(employeeList);
        return response;
    }
}
