package com.project.mini.Service;

import com.project.mini.BusinessObject.EmployeeBO;

public interface EmployeeService {

    EmployeeBO createEmployee(EmployeeBO bo);

    EmployeeBO getEmployee(Long id);
}