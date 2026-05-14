package com.project.mini.Controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.project.mini.BusinessObject.EmployeeBO;
import com.project.mini.COnstants.Constants;
import com.project.mini.Exception.GlobalExceptionHandler;
import com.project.mini.Service.EmployeeService;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class EmployeeControllerImpl implements EmployeeController {
	
	
    private final  EmployeeService service;
    
    private static final Logger log =
            LoggerFactory.getLogger(EmployeeControllerImpl.class);

    public EmployeeControllerImpl(EmployeeService service) {
        this.service = service;
    }
    
    

	@Override
	public EmployeeBO create(EmployeeBO bo) {
		log.info("Controller: Create called");
		return service.createEmployee(bo);
	}

	@Override
	public EmployeeBO get(Long id) {
		log.info("Controller: Get called");
		return service.getEmployee(id);
	}

	@Override
	public String health() {
		// TODO Auto-generated method stub
		return Constants.HEALTH_OK;
	}

}
