package com.employee.crud.data;

import com.employee.crud.entity.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeData {
    public static List<Employee> employeeData() {
        List<Employee> employeeList = new ArrayList<>();
        Employee employeeOne = new Employee(0, "小明", 20, "男");
        Employee employeeTwo = new Employee(1, "小红", 19, "女");
        Employee employeeThree = new Employee(2, "小智", 15, "男");
        Employee employeeFour = new Employee(3, "小钢", 16, "女");
        Employee employeeFive = new Employee(4, "小夏", 15, "女");
        employeeList.add(employeeOne);
        employeeList.add(employeeTwo);
        employeeList.add(employeeThree);
        employeeList.add(employeeFour);
        employeeList.add(employeeFive);
        return employeeList;
    }


}
