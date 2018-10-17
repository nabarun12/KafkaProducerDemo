package com.kafkaproject.model;



public class Person{
	
	
	public Person(String nameIn, int ageIn){
		this.name = nameIn;
		this.age = ageIn;
	}
	
	private String name;
	
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
