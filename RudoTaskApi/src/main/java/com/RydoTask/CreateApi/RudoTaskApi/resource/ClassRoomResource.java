package com.RydoTask.CreateApi.RudoTaskApi.resource;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.RydoTask.CreateApi.RudoTaskApi.entity.ClassRoom;
import com.RydoTask.CreateApi.RudoTaskApi.entity.Student;
import com.RydoTask.CreateApi.RudoTaskApi.repository.ClassRoomRepository;
import com.RydoTask.CreateApi.RudoTaskApi.repository.StudentRepository;

@RestController
public class ClassRoomResource {
	
	@Autowired
	private ClassRoomRepository classRepository;
	
	@Autowired
	private StudentRepository studentRepository;
	
	
	@RequestMapping(method = RequestMethod.GET,path = "/students/{id}")
	public Optional<Student> getStudentInfoById(@PathVariable int id) {
		
		return studentRepository.findById(id);
		
	}
	
	@RequestMapping(method = RequestMethod.GET,path = "/classroom/{id}/students")
	public List<Student> getStudentInfoFromClass(@PathVariable int id) {
		
		Optional<ClassRoom> classRoomOptional = classRepository.findById(id);
		
		ClassRoom classRoom = classRoomOptional.get();
		
		return classRoom.getStudentList();
		
	}

}
