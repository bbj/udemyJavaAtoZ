package com.udemy.app;

public class JavaBeanExample implements java.io.Serializable {

	private int id;
	private String name;

	public JavaBeanExample() {
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

}
