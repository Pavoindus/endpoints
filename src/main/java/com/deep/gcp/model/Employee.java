package com.deep.gcp.model;

/**
 * Created 6/3/2017 21:46
 *
 * @author Deepak Sharma
 */
public class Employee {

  private String name;
  private Long empId;
  private String address;
  private String phoneNumber;
  private String department;

  protected Employee() {
  }

  public Employee(String name, Long empId, String address, String phoneNumber,
      String department) {
    this.name = name;
    this.empId = empId;
    this.address = address;
    this.phoneNumber = phoneNumber;
    this.department = department;
  }

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

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public String getDepartment() {
    return department;
  }

  public void setDepartment(String department) {
    this.department = department;
  }
}
