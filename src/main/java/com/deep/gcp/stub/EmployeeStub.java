package com.deep.gcp.stub;

import com.deep.gcp.model.Employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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
            new Employee("Rahul Pokarna", 2l, "Some Other Address 2", "+91-xxx-xxx-xxxx",
                "Some Department"),
            new Employee("Iti Jain", 3l, "Some Other Address", "+91-xxx-xxx-xxxx",
                "Some Department"),
            new Employee("Akhil Sood", 4l, "Some Other Address", "+91-xxx-xxx-xxxx",
                "Some Department"),
            new Employee("Kirubakaran", 5l, "Some Other Address", "+91-xxx-xxx-xxxx",
                "Some Department"),
            new Employee("Shubha", 6l, "Some Other Address", "+91-xxx-xxx-xxxx",
                "Some Department"),
            new Employee("Vikas", 7l, "Some Other Address", "+91-xxx-xxx-xxxx",
                "Some Department"),
            new Employee("Tarun", 8l, "Some Other Address", "+91-xxx-xxx-xxxx",
                "Some Department"),
            new Employee("Aman", 9l, "Some Other Address", "+91-xxx-xxx-xxxx",
                "Some Department"),
            new Employee("Emp Name 10", 10l, "Some Other Address", "+91-xxx-xxx-xxxx",
                "Some Department") };
    List<Employee> empList = new ArrayList<>();
    for(Employee employee : emp) {
      empList.add(employee);
    }
    Collections.sort(empList, new Comparator<Employee>() {

      @Override public int compare(Employee o1, Employee o2) {
        if(o1.getEmpId() > o2.getEmpId())
          return 1;
        else if (o1.getEmpId() == o2.getEmpId())
          return 0;
        else
          return -1;
      }
    });
    return empList;
  }
}
