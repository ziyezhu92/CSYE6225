package com.csye6225.spring2019.courseservice.resource;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.csye6225.spring2019.courseservice.datamodel.Program;
import com.csye6225.spring2019.courseservice.service.ProgramService;

@Path("programs")
public class ProgramResource {
	ProgramService proService = new ProgramService();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Program> getPrograms(){
		return proService.getAllPrograms();
	}
	
	// ... webapi/programs/1 
	@GET
	@Path("/{programName}")
	@Produces(MediaType.APPLICATION_JSON)
	public Program getProgram(@PathParam("programName") String programName) {
		System.out.println("Program Resource: Looking for: " + programName);
		return proService.getProgram(programName);
	}
	
	@DELETE
	@Path("/{programName}")
	@Produces(MediaType.APPLICATION_JSON)
	public Program deleteProgram(@PathParam("programName") String programName) {
		return proService.deleteProgram(programName);
	}
	
	@POST
	@Path("/add/{courseName}")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Program addCourseToProgram(@PathParam("courseName") String courseName,Program program) {	
		System.out.println("ProgramName: " + program.getName());
		System.out.println("CourseName: " + courseName);
		return proService.addCourseToProgram(program.getName(), courseName);
	}
	
	@POST
	@Path("/delete/{courseName}")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Program deleteCourseFromProgram(@PathParam("courseName") String courseName,Program program) {	
		System.out.println("ProgramName: " + program.getName());
		System.out.println("CourseName: " + courseName);
		return proService.deletaCourseFromProgram(program.getName(), courseName);
	}
	
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Program addProgram(Program program) {
		proService.addProgram(program);
		return program;
	}
		
	@PUT
	@Path("/{programName}")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Program updateProgram(@PathParam("programName") String programName, 
			Program program) {
		return proService.updateProgramInformation(programName, program);
	}
		
}
