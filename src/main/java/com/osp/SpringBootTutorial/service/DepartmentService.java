package com.osp.SpringBootTutorial.service;

import com.osp.SpringBootTutorial.entity.Department;
import com.osp.SpringBootTutorial.error.DepartmentNotFoundException;

import java.util.List;

public interface DepartmentService {
    Department saveDepartment(Department department);

    List<Department> getAll();

    Department getbyId(Long departmentId) throws DepartmentNotFoundException;

    void deleteDepartmentById(Long id);

    Department update(Long id, Department department);

}
