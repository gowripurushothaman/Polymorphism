package com.iet;
class Animal{
	public void eat() {
		System.out.println("eating....");
	}
	}
	class Dog extends Animal{

		@Override
		public void eat() {
			// TODO Auto-generated method stub
			//super.eat();
			System.out.println("eating food");
		}
	
	}
	class Cat extends Animal{

		@Override
		public void eat() {
			// TODO Auto-generated method stub
			//super.eat();
			System.out.println("Eating rat...");
		}
		
	}
public class TestPoly {
	public void eat(Animal animal) {
		animal.eat();
		
	}
	public static void main(String[]args) {
		TestPoly test=new TestPoly();
		Dog dog=new Dog();
		Cat cat=new Cat();
		test.eat(dog);
		test.eat(cat);
		
	}

}
