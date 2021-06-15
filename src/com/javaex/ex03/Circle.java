package com.javaex.ex03;

public class Circle {
	
	private int radius;
	private double pi;
	
	public Circle(int radius, double pi) {
		super();
		this.radius = radius;
		this.pi = pi;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public double getPi() {
		return pi;
	}

	public void setPi(double pi) {
		this.pi = pi;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", pi=" + pi + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
