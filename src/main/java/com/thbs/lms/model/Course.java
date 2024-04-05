package com.thbs.lms.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "Course")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long courseID;

    private String courseName;

    private String level;

	public Long getCourseID() {
		return courseID;
	}

	public void setCourseID(Long courseID) {
		this.courseID = courseID;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}
    
    
}