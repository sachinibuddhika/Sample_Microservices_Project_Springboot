package com.dailycodebuffer.department_service.repository;

import com.dailycodebuffer.department_service.model.Department;
import com.dailycodebuffer.department_service.model.Employee;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class DepartmentRepository {
    private List<Department> departments=new ArrayList<>();
  private List<Employee> employees=new ArrayList<>();

public Department addDepartment(Department department){
    departments.add(department);
    return department;
}

public Department findById(Long id){
    return departments.stream().filter(department -> department.getId().equals(id)).findFirst().orElseThrow();
}

public List<Department> findAll(){
    return departments;
}



}
