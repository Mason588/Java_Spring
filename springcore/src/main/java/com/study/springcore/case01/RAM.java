package com.study.springcore.case01;

public class RAM {
	private Integer gb;
	public RAM() {}
	
	@Override
	public String toString() {
		return "RAM [gb=" + gb + "]";
	}

	public RAM(Integer gb) {
		super();
		this.gb = gb;
	}

	public Integer getGb() {
		return gb;
	}

	public void setGb(Integer gb) {
		this.gb = gb;
	}
}
