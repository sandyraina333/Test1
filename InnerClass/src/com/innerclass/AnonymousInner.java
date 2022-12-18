package com.innerclass;

public class AnonymousInner {



		public static void main(String[] args) {


			TestAbstract t= new TestAbstract() {
				
				
				void m1() {

					System.out.println("I am Anonymous Inner Class");
				}
			};
			t.m1();
		}

	}


