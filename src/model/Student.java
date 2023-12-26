package model;

import java.io.Serializable;

public class Student implements Serializable{
	static final long serialVersionUID = 21L;
	private String maSV;
	private String hovaten;
	private String IP;
	private int group;
	public String getMaSV() {
		return maSV;
	}
	public void setMaSV(String maSV) {
		this.maSV = maSV;
	}
	public String getHovaten() {
		return hovaten;
	}
	public void setHovaten(String hovaten) {
		this.hovaten = hovaten;
	}
	public String getIP() {
		return IP;
	}
	public void setIP(String iP) {
		IP = iP;
	}
	public int getGroup() {
		return group;
	}
	public void setGroup(int group) {
		this.group = group;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public Student(String maSV, String hovaten, String iP, int group) {
		super();
		this.maSV = maSV;
		this.hovaten = hovaten;
		IP = iP;
		this.group = group;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
