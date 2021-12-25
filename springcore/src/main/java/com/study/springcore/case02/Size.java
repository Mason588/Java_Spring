package com.study.springcore.case02;

public class Size {
	private String name;

	@Override
	public String toString() {
		return "Size [name=" + name + "]";
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Size() {}
	public Size(String name) {
		super();
		this.name = name;
	}
	
}
