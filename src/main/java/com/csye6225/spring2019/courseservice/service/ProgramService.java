package com.csye6225.spring2019.courseservice.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.csye6225.spring2019.courseservice.datamodel.Program;



public class ProgramService {
	static Map<String, Program> program_Map = new HashMap<>();
	public ProgramService() {}
	
	// Getting a list of all programs 
	// GET "..webapi/program"
	public List<Program> getAllPrograms(){
		//Getting the list
		List<Program> list = new ArrayList<>();
		for(Program program : program_Map.values()) {
			list.add(program);
		}
		return list;
	}
	
	// Adding a Program
	public void addProgram(Program program) {
		//Create a Program Object
		program_Map.put(program.getName(), program);
	}
	
	// Adding course to a program
	public Program addCourseToProgram(String programName, String course) {
		program_Map.get(programName).getCourses().add(course);
		return program_Map.get(programName);
	}
	
	// Deleting a course from a program
	public Program deletaCourseFromProgram(String programName, String course) {
		program_Map.get(programName).getCourses().remove(course);
		return program_Map.get(programName);
	}
	
	
	//Getting One Program
	public Program getProgram(String programName) {
		Program program = program_Map.get(programName);
		System.out.println("Item retrieved:");
	    //System.out.println(program.toString());
	    return program;
	}
	
	//Deleting a program
	public Program deleteProgram(String programName) {
		Program deletedProgramDetails = program_Map.get(programName);
		program_Map.remove(programName);
		return deletedProgramDetails;
	}
		
	//Updating Program, Info
	public Program updateProgramInformation(String programName, Program program) {
		program_Map.put(programName,program);
		return program;
	}
}
