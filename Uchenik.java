package edu.smg;

public class Uchenik {
	private String name;
	private double uspeh;
	private double height;
	public static int SLOW = 1, FAST = 2, MEDIUM;

	Uchenik() {
	}

	Uchenik(String ime1, double uspeh1) {
		setName(ime1);
		setUspeh(uspeh1);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getUspeh() {
		return uspeh;
	}

	public void setUspeh(double uspeh) {
		this.uspeh = uspeh;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}


}