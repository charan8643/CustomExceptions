package com.project.mini.Controller;

import org.antlr.v4.runtime.misc.NotNull;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;

import com.project.mini.BusinessObject.EmployeeBO;

@RequestMapping("/api/employees")
public interface EmployeeController {

    @PostMapping
    EmployeeBO create(@RequestBody  EmployeeBO bo);

    @GetMapping("/{id}")
    EmployeeBO get(
        @PathVariable
        @NotNull
        Long id
    );

    @GetMapping("/health")
    String health();
}