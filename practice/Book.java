package com.java.demo.intro;

class BookLibrary{
	Book obj=new Book();
	void display() {
		System.out.println(obj.getAge());
		System.out.println(obj.getName());
		System.out.println(obj.getEmail());
	}
}

public class Book {
	private String name;
	private String email;
	private int id;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
