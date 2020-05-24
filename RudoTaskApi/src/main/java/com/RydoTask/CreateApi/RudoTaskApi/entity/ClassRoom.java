package com.RydoTask.CreateApi.RudoTaskApi.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class ClassRoom {

	@Id
	@GeneratedValue
	private int id;
	
	@OneToMany(mappedBy = "classRoom")
	private List<Student> studentList;

	public ClassRoom() {
		
	}
	

	public ClassRoom(int id) {
		super();
		this.id = id;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<Student> getStudentList() {
		return studentList;
	}

	public void setStudentList(List<Student> studentList) {
		this.studentList = studentList;
	}

	@Override
	public String toString() {
		return "ClassRoom [id=" + id + "]";
	}
	
	
	
}
