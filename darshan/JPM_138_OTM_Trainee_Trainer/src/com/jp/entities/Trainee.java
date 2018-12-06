package com.jp.entities;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="Trainee")
public class Trainee {
	
	@Id
	@Column(name="trainee_id")
	private Long traineeId;
	
	@Column(name="trainee_name")
	private String traineeName;
	

	
	@ManyToMany(mappedBy="trainee", fetch=FetchType.LAZY)
	private Set<Course> course;

	public Set<Course> getCourse() {
		return course;
	}

	public void setCourse(Set<Course> course) {
		this.course = course;
	}

	public Long getTraineeId() {
		return traineeId;
	}

	public void setTraineeId(Long traineeId) {
		this.traineeId = traineeId;
	}

	public String getTraineeName() {
		return traineeName;
	}

	public void setTraineeName(String traineeName) {
		this.traineeName = traineeName;
	}

	
	@Override
	public String toString() {
		return "Trainee [traineeId=" + traineeId + ", traineeName=" + traineeName + ", course=" + course + "]";
	}

	public Trainee() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
