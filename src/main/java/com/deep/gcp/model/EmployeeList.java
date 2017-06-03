package com.deep.gcp.model;

/**
 * Created 6/3/2017 21:48
 *
 * @author Deepak Sharma
 */
public class EmployeeList {

  protected EmployeeList(){
  }

  public EmployeeList(String name, Long empId) {
    this.name = name;
    this.empId = empId;
  }

  private String name;
  private Long empId;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Long getEmpId() {
    return empId;
  }

  public void setEmpId(Long empId) {
    this.empId = empId;
  }
}
