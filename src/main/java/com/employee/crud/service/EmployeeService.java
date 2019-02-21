package com.employee.crud.service;

import com.employee.crud.data.EmployeeData;
import com.employee.crud.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    private List<Employee> employeeData = EmployeeData.employeeData();

    public List<Employee> getAllEmployee() {
        return employeeData;
    }

    public void addEmployee(Employee employee) {
        employeeData.add(employee);
    }

    public void updateEmployeeById(int employeeId, Employee employee) {
        Employee employeeInfo = getEmployeeById(employeeId);
        employeeInfo.setName(employee.getName());
        save(employeeInfo);
    }

    private Employee getEmployeeById(int employeeId) {
        Employee f = new Employee();
        for (int n = 0; n < employeeData.size(); n++) {
            if (employeeData.get(n).getId() == employeeId) {
               f =  employeeData.get(n);
            }
        }
        return f;
    }

    private void save(Employee employInfo) {
        int index = 0;
        for (int i = 0; i < employeeData.size(); i++) {
            if (employeeData.get(i).getId() == employInfo.getId()) {
                index = i;
            }
        }
        employeeData.set(index, employInfo);
    }


    public void deleteEmployeeById(int employeeId) {
        deleteById(employeeId);
    }

    private void deleteById(int employeeId) {
        Employee employee = getEmployeeById(employeeId);
        employeeData.remove(employee);
    }
}
