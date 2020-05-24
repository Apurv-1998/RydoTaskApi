package com.RydoTask.CreateApi.RudoTaskApi.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Student {
	
	@Id
	@GeneratedValue
	private int id;
	private String name;
	
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JsonIgnore
	private ClassRoom classRoom;
	
	public Student() {
		
	}

	public Student(int id, String name, ClassRoom classRoom) {
		super();
		this.id = id;
		this.name = name;
		this.classRoom = classRoom;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ClassRoom getClassRoom() {
		return classRoom;
	}

	public void setClassRoom(ClassRoom classRoom) {
		this.classRoom = classRoom;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	
	

}
