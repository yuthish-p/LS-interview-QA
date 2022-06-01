package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class data {
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private String name ;
	private String gender;
	private String dob;
	private String about;
	private byte[] pdffile;
	public byte[] getPdffile() {
		return pdffile;
	}
	public void setPdffile(byte[] pdffile) {
		this.pdffile = pdffile;
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getAbout() {
		return about;
	}
	public void setAbout(String about) {
		this.about = about;
	}
	
	
	
	

}
