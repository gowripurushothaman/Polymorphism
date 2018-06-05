package com.iet;

public class Output {
	public static void main(String[] args) {
		Output output=new Output();
		Ferrari ferrari=new Ferrari();
		BMW bmw=new BMW();
		output.speed(ferrari);
		output.speed(bmw);
		 
		 
		
	}
	public void speed(NewCar newcar) {
		newcar.speed();
	}
	}
