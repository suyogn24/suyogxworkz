package com.xworkz.institute.dto;

import java.time.LocalDate;

public class CourseDTO {
	
	private int id;
	private	String name;
	private	double duration;
	private	int fees;
	private	LocalDate startDate;
	private boolean free;
	
	
	public CourseDTO(int id, String name, double duration, int fees, LocalDate startDate, boolean free) {
		super();
		this.id = id;
		this.name = name;
		this.duration = duration;
		this.fees = fees;
		this.startDate = startDate;
		this.free = free;
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

	public double getDuration() {
		return duration;
	}

	public void setDuration(double duration) {
		this.duration = duration;
	}

	public int getFees() {
		return fees;
	}

	public void setFees(int fees) {
		this.fees = fees;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public boolean isFree() {
		return free;
	}

	public void setFree(boolean free) {
		this.free = free;
	}
	
	
}
