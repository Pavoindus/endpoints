package com.deep.gcp.stub;

import com.deep.gcp.model.Employee;

import java.util.ArrayList;
import java.util.List;

/**
 * Created 6/3/2017 21:55
 *
 * @author Deepak Sharma
 */
public class EmployeeStub {

  public static List<Employee> getStubbedEmployees() {
    Employee[] emp =
        { new Employee("Deepak Sharma", 1l, "Some Address", "+91-81x-xxx-xx08",
            "Development"),
            new Employee("Emp Name 2", 2l, "Some Other Address", "+91-xxx-xxx-xxxx",
                "Some Department"),
            new Employee("Emp Name 3", 3l, "Some Other Address", "+91-xxx-xxx-xxxx",
                "Some Department"),
            new Employee("Emp Name 4", 4l, "Some Other Address", "+91-xxx-xxx-xxxx",
                "Some Department"),
            new Employee("Emp Name 5", 5l, "Some Other Address", "+91-xxx-xxx-xxxx",
                "Some Department"),
            new Employee("Emp Name 6", 6l, "Some Other Address", "+91-xxx-xxx-xxxx",
                "Some Department"),
            new Employee("Emp Name 7", 7l, "Some Other Address", "+91-xxx-xxx-xxxx",
                "Some Department"),
            new Employee("Emp Name 8", 8l, "Some Other Address", "+91-xxx-xxx-xxxx",
                "Some Department"),
            new Employee("Emp Name 9", 9l, "Some Other Address", "+91-xxx-xxx-xxxx",
                "Some Department"),
            new Employee("Emp Name 10", 10l, "Some Other Address", "+91-xxx-xxx-xxxx",
                "Some Department") };
    List<Employee> empList = new ArrayList<>();
    for(Employee employee : emp) {
      empList.add(employee);
    }
    empList.sort((o1, o2) -> {
      if(o1.getEmpId() > o2.getEmpId())
        return 1;
      else if (o1.getEmpId() == o2.getEmpId())
        return 0;
      else
        return -1;
    });
    return empList;
  }
}
