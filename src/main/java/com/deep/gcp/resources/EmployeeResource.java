package com.deep.gcp.resources;

import com.deep.gcp.model.Employee;
import com.deep.gcp.model.EmployeeList;
import com.deep.gcp.service.EmployeeService;

import javax.annotation.Resource;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * Created 6/3/2017 21:41
 *
 * @author Deepak Sharma
 */

@Path("/")
public class EmployeeResource {

  @GET
  @Produces(MediaType.APPLICATION_JSON)
  @Path("/employees")
  public List<EmployeeList> getEmployeeList() {
    return EmployeeService.getEmployeeList();
  }

  @GET
  @Produces(MediaType.APPLICATION_JSON)
  @Path("/employee/{empId}")
  public Employee getEmployeeDetails(@PathParam("empId") Long empId) {
    return EmployeeService.getEmployeeDetails(empId);
  }
}
