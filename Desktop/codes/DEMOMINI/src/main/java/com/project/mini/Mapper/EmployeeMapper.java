package com.project.mini.Mapper;

import org.springframework.stereotype.Component;

import com.project.mini.BusinessObject.EmployeeBO;
import com.project.mini.Entity.EmployeeEO;

@Component
public class EmployeeMapper {

    public com.project.mini.Entity.EmployeeEO toEntity(EmployeeBO bo) {
        if (bo == null) return null;

        EmployeeEO entity = new EmployeeEO();
        entity.setId(bo.getId());
        entity.setName(bo.getName());
        entity.setAge(bo.getAge());
        return entity;
    }

    public EmployeeBO toBO(EmployeeEO entity) {
        if (entity == null) return null;

        EmployeeBO bo = new EmployeeBO();
        bo.setId(entity.getId());
        bo.setName(entity.getName());
        bo.setAge(entity.getAge());
        return bo;
    }
}