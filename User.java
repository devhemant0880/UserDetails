package com.votingSystem;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class User {

private String name;
private String email;
private String dob;
private String age;
public User() {}
public User(String name,String email,String dob) {
	this.name=name;
	this.email=email;
	this.dob=dob;
	

}
public String getAge() {
	return age;
}
public void setAge(String age) {
	this.age = age;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getDob() {
	return dob;
}
public void setDob(String dob) {
	this.dob = dob;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
}
