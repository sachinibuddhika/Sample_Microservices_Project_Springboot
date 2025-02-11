package com.dailycodebuffer.department_service.model;

import java.util.ArrayList;
import java.util.List;

public class Department {
private Long id;
private String name;
private List<Employee> emloyees=new ArrayList<>();

    public Department(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Department() {
    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", emloyees=" + emloyees +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Employee> getEmloyees() {
        return emloyees;
    }

    public void setEmloyees(List<Employee> emloyees) {
        this.emloyees = emloyees;
    }
}
