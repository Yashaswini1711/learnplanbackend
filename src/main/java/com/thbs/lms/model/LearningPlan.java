package com.thbs.lms.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "LearningPlan")
public class LearningPlan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long learningPlanID;

    private String type;

    private Long batchID;

	public Long getLearningPlanID() {
		return learningPlanID;
	}

	public void setLearningPlanID(Long learningPlanID) {
		this.learningPlanID = learningPlanID;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Long getBatchID() {
		return batchID;
	}

	public void setBatchID(Long batchID) {
		this.batchID = batchID;
	}
    
}