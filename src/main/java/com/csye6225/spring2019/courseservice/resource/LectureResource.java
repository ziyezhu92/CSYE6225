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

import com.csye6225.spring2019.courseservice.datamodel.Lecture;
import com.csye6225.spring2019.courseservice.service.LectureService;

@Path("lectures")
public class LectureResource {
	LectureService lecService = new LectureService();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Lecture> getLectures(){
		return lecService.getAllLectures();
	}
	
	// ... webapi/lecture/1 
	@GET
	@Path("/{lectureId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Lecture getLecture(@PathParam("lectureId") String lecName) {
		System.out.println("Lecture Resource: Looking for: " + lecName);
		return lecService.getLecture(lecName);
	}
	
	@DELETE
	@Path("/{lectureId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Lecture deleteLecture(@PathParam("lectureId") String lecName) {
		return lecService.deleteLecture(lecName);
	}
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Lecture addLecture(Lecture lec) {
		lecService.addLecture(lec);
		return lec;
	}
	
	@PUT
	@Path("/{lectureId}")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Lecture updateLecture(@PathParam("lectureId") String lecName, 
			Lecture lec) {
		return lecService.updateLectureInformation(lecName, lec);
	}
}
