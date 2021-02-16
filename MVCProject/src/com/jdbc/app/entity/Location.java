package com.jdbc.app.entity;

public class Location {
int id;
String locName;
String regdate;
String flag;



public Location(int id, String locName, String regdate, String flag) {
	
	this.id = id;
	this.locName = locName;
	this.regdate = regdate;
	this.flag = flag;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getRegdate() {
	return regdate;
}
public void setRegdate(String regdate) {
	this.regdate = regdate;
}

public String getLocName() {
	return locName;
}
public void setLocName(String locName) {
	this.locName = locName;
}
public String getFlag() {
	return flag;
}
public void setFlag(String flag) {
	this.flag = flag;
}
}
