package com.krishna;

public class Car {

	private String car_name[];
	private Engine engine[];

	public String[] getCar_name() {
		return car_name;
	}

	public void setCar_name(String[] car_name) {
		this.car_name = car_name;
	}

	public Engine[] getEngine() {
		return engine;
	}

	public void setEngine(Engine[] engine) {
		this.engine = engine;
	}

	public void show() {
		for (String c : car_name) {
			System.out.println(c);
		}
		for (Engine e : engine) {
			System.out.println(e.getCategory());
		}
	}
}
