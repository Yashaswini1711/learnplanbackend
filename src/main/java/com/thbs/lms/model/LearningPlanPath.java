package com.thbs.lms.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name = "LearningPlanPath")
public class LearningPlanPath {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long pathID;

    @ManyToOne
    @JoinColumn(name = "learningPlanID")
    private LearningPlan learningPlan;

    @ManyToOne
    @JoinColumn(name = "courseID")
    private Course course;

    private String type;

    private String trainer;

    @Temporal(TemporalType.DATE)
    private Date startDate;

    @Temporal(TemporalType.DATE)
    private Date endDate;

	public Long getPathID() {
		return pathID;
	}

	public void setPathID(Long pathID) {
		this.pathID = pathID;
	}

	public LearningPlan getLearningPlan() {
		return learningPlan;
	}

	public void setLearningPlan(LearningPlan learningPlan) {
		this.learningPlan = learningPlan;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getTrainer() {
		return trainer;
	}

	public void setTrainer(String trainer) {
		this.trainer = trainer;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
    
}