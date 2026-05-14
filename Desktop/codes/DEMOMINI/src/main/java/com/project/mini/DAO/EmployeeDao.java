package com.project.mini.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.mini.Entity.EmployeeEO;

public interface EmployeeDao extends JpaRepository<EmployeeEO, Long> {

}
