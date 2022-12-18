package com.polymorphism.java;

class Animal1{
	void sounds() {
		System.out.println("Animal makes sounds");
	}
}

class Dog extends Animal1{
	void sounds() {
		System.out.println("Dog sounds bow bow");
	}
}

class Cat extends Animal1{
	void sounds() {
		System.out.println("cat sounds meow meow");
	}
}
class Monkey extends Animal1{
	void sounds() {
		System.out.println("Monkey sounds keach keach");
	}
}

public class MethodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal1 d=new Dog();
		Animal1 c=new Cat();
		Animal1 m=new Monkey();
		d.sounds();
		c.sounds();
		m.sounds();
		
	}

}
