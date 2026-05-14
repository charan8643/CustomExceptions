package com.project.mini.Service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.project.mini.BusinessObject.EmployeeBO;
import com.project.mini.Controller.EmployeeControllerImpl;
import com.project.mini.DAO.EmployeeDao;
import com.project.mini.Entity.EmployeeEO;
import com.project.mini.Mapper.EmployeeMapper;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeDao dao;
    private final EmployeeMapper mapper;
    
    private static final Logger log =
            LoggerFactory.getLogger(EmployeeServiceImpl.class);
    
    public EmployeeServiceImpl(EmployeeDao dao, EmployeeMapper mapper) {
        this.dao = dao;
        this.mapper = mapper;
    }

    @Override
    public EmployeeBO createEmployee(EmployeeBO bo) {
        log.info("Service: Creating employee");
        EmployeeEO saved = dao.save(mapper.toEntity(bo));
        return mapper.toBO(saved);
    }

    @Override
    public EmployeeBO getEmployee(Long id) {
        log.info("Service: Fetching employee {}", id);
        return dao.findById(id)
                .map(mapper::toBO)
                .orElseThrow(() -> new RuntimeException("Employee not found"));
    }
}