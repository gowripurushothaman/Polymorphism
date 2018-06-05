package com.iet;
class Bank{
	public void RateOfInterst() {
		System.out.println("0.8");
	}
}
class Axis extends Bank{

	@Override
	public void RateOfInterst() {
		// TODO Auto-generated method stub
		//super.RateOfInterst();
		System.out.println("2");
	}
	
}
class Icici extends Bank{

	@Override
	public void RateOfInterst() {
		// TODO Auto-generated method stub
		//super.RateOfInterst();
		System.out.println("18");
	}
	
}
public class Poly {
	public void RateOfInterst(Bank bank) {
		bank.RateOfInterst();
	}
	public static void main(String[] args) {
		
		Poly poly=new Poly();
		Axis axis=new Axis();
		Icici ic=new Icici();
		poly.RateOfInterst(axis);
		poly.RateOfInterst(ic);
		
		
		
		
	}

}
