package org.brainypeople.eazy.validator;

import org.brainypeople.eazy.dao.EmployeeDao;
import org.brainypeople.eazy.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public class EmployeeValidator extends Validator {

    @Autowired
    EmployeeDao dao;

    public boolean validateEmployee(Map<String, Object> params, List<String> errors) {
        boolean returnValue = true;
        Employee employee = (Employee) params.get("employee");

//        // email already exist
//        if(employee.getEmail() != null)
//        {
//            boolean isEmailExist = dao.isEmailExist(employee.getEmail());
//            if (isEmailExist) {
//                errors.add("Email Already Exist");
//                returnValue = false;
//            }
//        }else
//        {
//            errors.add("Email can not be null");
//            returnValue = false;
//        }
        if(!validateEmail(employee.getEmail(),employee.getId(),errors))
            returnValue = false;
       if(! validateFirstName(employee.getFirstName(), errors))
           returnValue = false;
//        // firstName not null
//        if (employee.getFirstName() == null) {
//            errors.add("First Name can not be null");
//            returnValue = false;
//        }

        // firstName not null
        // email not null
        // valid email pattern
        // char limit
        // firstName/lastName should start with char
        // email should be unique

        return returnValue;
    }

//    public boolean validateUpdateEmployee(Map<String, Object> params, List<String> errors) {
//        boolean returnValue = true;
//        Employee employee = (Employee) params.get("employee");
//
//        if(!validateEmail(employee.getEmail(),employee.getId(),errors))
//            returnValue = false;
//        if(! validateFirstName(employee.getFirstName(), errors))
//            returnValue = false;
//
//
////        // email already exist
////        if(employee.getEmail() != null)
////        {
////            boolean isEmailExist = dao.isEmailExist(employee.getEmail(),employee.getId());
////            if (isEmailExist) {
////                errors.add("Email Already Exist");
////                returnValue = false;
////            }
////        }else
////        {
////            errors.add("Email can not be null");
////            returnValue = false;
////        }
//
////        // firstName not null
////        if (validateNotNull(employee.getFirstName())) {
////            errors.add("First Name can not be null");
////            returnValue = false;
////        }
//
//        return returnValue;
//    }

    boolean validateNotNull(String value)
    {
        return value!=null && value.length()>0;

    }

    boolean validateFirstName(String name, List<String> errors)
    {
        if(!validateNotNull(name))
        {
            errors.add("First Name can not be null");
            return false;
        }
           return true;
    }

    boolean validateEmail(String email,Integer id, List<String> errors)
    {
        if(!validateNotNull(email))
        {
            errors.add("Email can not be null");
            return false;
        }else
        {
            boolean isemailExist = false;
            if(id != null)
            {
                isemailExist = dao.isEmailExist(email,id);
            }else
            {
                isemailExist = dao.isEmailExist(email);

            }
            if(isemailExist) {
                errors.add("Email Already Exist");
                return false;
            }else
                return true;

        }

    }




}
