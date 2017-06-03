package com.deep.gcp.service;

import com.deep.gcp.model.Employee;
import com.deep.gcp.model.EmployeeList;
import com.deep.gcp.stub.EmployeeStub;

import java.util.ArrayList;
import java.util.List;

/**
 * Created 6/3/2017 21:50
 *
 * @author Deepak Sharma
 */
public class EmployeeService {

  public static List<EmployeeList> getEmployeeList() {
    List<Employee> employeeStub = EmployeeStub.getStubbedEmployees();
    List<EmployeeList> employeeList = new ArrayList<>();
    for(Employee employee : employeeStub) {
      EmployeeList el = new EmployeeList(employee.getName(), employee.getEmpId());
      employeeList.add(el);
    }
    return employeeList;
  }

  public static Employee getEmployeeDetails(Long empId) {
    for (Employee employee : EmployeeStub.getStubbedEmployees()) {
      if(employee.getEmpId() == empId) {
        return employee;
      }
    }
    return null;
  }
}
