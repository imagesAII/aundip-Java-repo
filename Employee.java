package com.inheritance;

public class Employee {
	
	private int id;
	private String name;
	private String email;
	private int addharno;
	private String pancard;
	
	
	
	public Employee(int id, String name, String email, int addharno, String pancard) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.addharno = addharno;
		this.pancard = pancard;
	}



	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", email=" + email + ", addharno=" + addharno + ", pancard="
				+ pancard + "]";
	}
	
	
	
	
	

}
