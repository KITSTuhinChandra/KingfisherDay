package com.tcs.KingfisherDay.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

import com.tcs.KingfisherDay.model.key.ResponseKey;

@Entity
@Table(name = "RESPONSE")
@IdClass(ResponseKey.class)
public class Response {

	@Id
	@Column(name = "QUESTION_ID", nullable = false)
	private String questionID;
	@Id
	@Column(name = "EMPLOYEE_EMAIL", nullable = false)
	private String employeeEmail;
	@Column(name = "OPTION", nullable = false)
	private String option;
	@Column(name = "TIME_STAMP", nullable = false)
	private Timestamp timeStamp;

	public Response() {

	}

	public Response(String questionID, String employeeEmail, String option, Timestamp timeStamp) {
		super();
		this.questionID = questionID;
		this.employeeEmail = employeeEmail;
		this.option = option;
		this.timeStamp = timeStamp;
	}

	public String getQuestionID() {
		return questionID;
	}

	public void setQuestionID(String questionID) {
		this.questionID = questionID;
	}

	public String getEmployeeEmail() {
		return employeeEmail;
	}

	public void setEmployeeEmail(String employeeEmail) {
		this.employeeEmail = employeeEmail;
	}

	public String getOption() {
		return option;
	}

	public void setOption(String option) {
		this.option = option;
	}

	public Timestamp getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(Timestamp timeStamp) {
		this.timeStamp = timeStamp;
	}

	@Override
	public String toString() {
		return "Response [questionID=" + questionID + ", employeeEmail=" + employeeEmail + ", option=" + option
				+ ", timeStamp=" + timeStamp + "]";
	}

}
