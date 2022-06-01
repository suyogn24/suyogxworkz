package com.xworkz.batch.dto;

public class BatchDTO {

	private int id;
	private String courseName;
	private String startDate;
	private int fees;
	
	
	
	@Override
	public String toString() {
		return "BatchDTO  [id=" + id + ", courseName=" + courseName + ", startDate=" + startDate + 	
			" ,fees=" + fees + "]";
	}



	public BatchDTO(int id, String courseName, String startDate, int fees) {
		super();
		this.id = id;
		this.courseName = courseName;
		this.startDate = startDate;
		this.fees = fees;
	}
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getStartDate() {
		return startDate;
	}

    public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public int getFees() {
		return fees;
	}

	public void setFees(int fees) {
		this.fees = fees;
	}
	
	
	
}
