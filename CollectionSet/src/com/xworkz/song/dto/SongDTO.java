package com.xworkz.song.dto;

import java.util.Objects;

public class SongDTO {

	private int id;
	private String name;
	private String singer;
	private	double duration;
	
	public SongDTO(Integer id,String name,String singer,double duration) {
		super();
		this.id = id;
		this.name = name;
		this.singer = singer;
		this.duration = duration;	
	}



	@Override
	public int hashCode() {
		System.out.println("hashcode");
		int superHashcode=super.hashCode();
		System.out.println("superHashcode");
		return superHashcode;
	}



	@Override
	public boolean equals(Object obj) {
		System.out.println("equals method");
		if (this==obj)
			return true;
		if (obj==null)
			return false;
		if (getClass()!=obj.getClass())
			return false;
	SongDTO other= (SongDTO) obj;
	return Objects.equals(name, other.name) && Objects.equals(singer, other.singer);
	}



	@Override
	public String toString() {
		return "SongDTO [id=" + id + ", name=" + name + ", singer=" + singer + ", duration=" + duration + "]";
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
	public String isSinger() {
		return singer;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
	public double getDuration() {
		return duration;
	}
	public void setDuration(double duration) {
		this.duration = duration;
	}
	
	
	
}
