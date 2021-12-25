package com.study.springcore.case06;

public class RoundImpl implements RoundBean{
	private double radius;
	
	//得到圓面積
		@Override
		public double getRoundArea() {

			return Math.pow(radius,2) * Math.PI;
		}

		@Override
		public void setRadius(double r) {
			this.radius = r;
			
		}

		@Override
		public double getRadius() {
			
			return radius;
		}

	
}
