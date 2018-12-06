package com.jp.entities;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="Course")
public class Course {
	
	@Id
	@Column(name="course_id")
	private Long courseId;
	
	@Column(name="course_name")
	private String courseName;
	
	@Column(name="trainer_Name")
	private String trainerName;
	
	
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="Course_Trainee", joinColumns={@JoinColumn(name="course_id")} , 
	inverseJoinColumns={@JoinColumn(name="trainee_id")} )
	private Set<Trainee> trainee;


	public Long getCourseId() {
		return courseId;
	}


	public void setCourseId(Long courseId) {
		this.courseId = courseId;
	}


	public String getCourseName() {
		return courseName;
	}


	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}


	public String getTrainerName() {
		return trainerName;
	}


	public void setTrainerName(String trainerName) {
		this.trainerName = trainerName;
	}


	public Set<Trainee> getTrainee() {
		return trainee;
	}


	public void setTrainee(Set<Trainee> trainee) {
		this.trainee = trainee;
	}


	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", courseName=" + courseName + ", trainerName=" + trainerName
				+ ", trainee=" + trainee + "]";
	}
	
	
	
	
}
