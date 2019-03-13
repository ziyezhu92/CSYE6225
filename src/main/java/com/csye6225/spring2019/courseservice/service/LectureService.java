package com.csye6225.spring2019.courseservice.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.csye6225.spring2019.courseservice.datamodel.InMemoryDatabase;
import com.csye6225.spring2019.courseservice.datamodel.Lecture;



public class LectureService {
	static Map<String, Lecture> lec_Map = InMemoryDatabase.getLectureDB();
	public LectureService() {}

	// Getting a list of all Lectures 
	public List<Lecture> getAllLectures(){
		//Getting the list
		List<Lecture> list = new ArrayList<>();
		for(Lecture lec : lec_Map.values()) {
			list.add(lec);
		}
		return list;
	}
	
	// Adding a lecture
	public void addLecture(Lecture lec) {
		//Create a lecture Object
		lec_Map.put(lec.getName(), lec);
	}
	
	
	//Getting One lecture
	public Lecture getLecture(String lecName) {
		Lecture lec = lec_Map.get(lecName);
		System.out.println("Item retrieved:");
	    System.out.println(lec.toString());
	    return lec;
	}

	//Deleting a lecture
	public Lecture deleteLecture(String lecName) {
		Lecture deletedLecture = lec_Map.get(lecName);
		lec_Map.remove(lecName);
		return deletedLecture;
	}
	
	//Updating Lecture Info
	public Lecture updateLectureInformation(String lecName, Lecture lec) {
		lec_Map.put(lecName,lec);
		return lec;
	}
}
