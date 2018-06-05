package com.iet;


class Doctor {
	
	public void details() {
		System.out.println("He is Doctor");
	}
}
	class Surgeon extends Doctor {

		@Override
		public void details() {
			// TODO Auto-generated method stub
			// super.details();
			System.out.println("He is Surgeon");
		}

	}
	class Cardiologist extends Doctor {

		@Override
		public void details() {
			// TODO Auto-generated method stub
			// super.details();
			System.out.println("He is cardiologist");
		}

	}


public class Hospital {
	public void details(Doctor doctor) {
		doctor.details();
	}
	public static void main(String[] args) {
		Hospital hospital=new Hospital();
		Surgeon s=new Surgeon();
		Cardiologist c=new Cardiologist();
		hospital.details(s);
		hospital.details(c);
	}


}
