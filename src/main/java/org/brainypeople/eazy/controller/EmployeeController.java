package org.brainypeople.eazy.controller;

import org.brainypeople.eazy.model.Employee;
import org.brainypeople.eazy.response.Response;
import org.brainypeople.eazy.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(value = "/eazy")
public class EmployeeController {
    @Autowired
    EmployeeService service;

    @PostMapping(value = "/employee")
    public Response addEmployee(
            @RequestBody Employee employee
    )
    {
        Map<String,Object> params = new HashMap<String,Object>();
        params.put("employee",employee);
        Response response = service.addEmployeeService(params);
        return response;


    }

    @PutMapping(value = "/employee")
    public Response updateEmployee(
            @RequestBody Employee employee
    )
    {
        Map<String,Object> params = new HashMap<String,Object>();
        params.put("employee",employee);
        Response response = service.updateEmployee(params);
        return response;


    }

    @GetMapping(value = "/employee")
    public Response getEmployees(
            @RequestParam(value="id",required = false) Integer id,
            @RequestParam(value="firstName",required = false) String firstName,
            @RequestParam(value="lastName",required = false) String lastName,
            @RequestParam(value="email",required = false) String email
    )
    {
        Map<String,Object> params = new HashMap<String,Object>();
        params.put("id",id);
        params.put("firstName",firstName);
        params.put("lastName",lastName);
        params.put("email",email);
        Response response = service.getEmployees(params);
        return response;


    }


}
