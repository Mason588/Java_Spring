package com.study.springcore.case04;

public abstract class CurrencyImpl implements Currency {
	protected double value;
	@Override
	public double getvalue() {
			return value;
	}

	@Override
	public void setValue(double value) {
		this.value = value;
	}
	
}
