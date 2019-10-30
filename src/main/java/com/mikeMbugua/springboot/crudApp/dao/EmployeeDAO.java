package com.mikeMbugua.springboot.crudApp.dao;


import com.mikeMbugua.springboot.crudApp.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    public List<Employee> findALl();

    public Employee findById(int theId);

    public void save(Employee theEmployee);

    public void deleteById(int theId);

}
