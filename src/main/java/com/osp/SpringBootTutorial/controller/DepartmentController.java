package com.osp.SpringBootTutorial.controller;

import com.osp.SpringBootTutorial.entity.Department;
import com.osp.SpringBootTutorial.error.DepartmentNotFoundException;
import com.osp.SpringBootTutorial.service.DepartmentService;
import com.osp.SpringBootTutorial.service.DepartmentServiceimpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    private final Logger LOGGER = LoggerFactory.getLogger(DepartmentController.class);

    @PostMapping(value = "/departments")
    public Department saveDepartment(@Valid @RequestBody Department department){
        LOGGER.info("Inside saveDepartments of Departmentcontroller");
        return departmentService.saveDepartment(department);
    }

    @GetMapping(value = "/getAll")
    public List<Department> getAll(){
        LOGGER.info("Inside getAll of Departmentcontroller");
        return departmentService.getAll();
    }

    @GetMapping(value = "/getById/{Id}")
    public Department getById(@PathVariable ("Id") Long departmentId) throws DepartmentNotFoundException {
        return departmentService.getbyId(departmentId);
    }

    @DeleteMapping(value = "/delete/{id}")
    public String deleteDepartmentById(@PathVariable("id") Long id){
        departmentService.deleteDepartmentById(id);
        return "Department sucessfully deleted";
    }

    @PostMapping("/update/{id}")
    public Department updateDepartment(@PathVariable("id") Long id, @RequestBody Department department){
        return departmentService.update(id,department);
    }

}
