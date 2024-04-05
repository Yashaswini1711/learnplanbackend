package com.thbs.lms.model;

import lombok.Data;
import jakarta.persistence.*;

@Data
@Entity
@Table(name = "Topic")
public class Topic {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long topicID;

    private String topicName;
    private String description;

    @ManyToOne
    @JoinColumn(name = "courseID")
    private Course course;

	public Long getTopicID() {
		return topicID;
	}

	public void setTopicID(Long topicID) {
		this.topicID = topicID;
	}

	public String getTopicName() {
		return topicName;
	}

	public void setTopicName(String topicName) {
		this.topicName = topicName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}
    
    
}
