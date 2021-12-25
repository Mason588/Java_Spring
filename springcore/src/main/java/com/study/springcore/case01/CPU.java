package com.study.springcore.case01;

public class CPU {

	private  Double ghz;
	public CPU() {
		System.out.println("建構CPU");
	}
	
	public Double getGhz() {
		return ghz;
	}

	public void setGhz(Double ghz) {
		this.ghz = ghz;
	}

	public CPU(Double ghz) {
		this.ghz = ghz;
	}

	@Override
	public String toString() {
		return "CPU [ghz=" + ghz + "]";
	}
	

}
