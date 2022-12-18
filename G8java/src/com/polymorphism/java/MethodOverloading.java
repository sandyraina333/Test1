package com.polymorphism.java;

public class MethodOverloading {

		public int sum(int a, int b) { return (a + b); }


		public int sum(int a, int b, int c)
		{
			return (a + b + c);
		}


		public double sum(double a, double b)
		{
			return (a + b);
		}


		public static void main(String args[])
		{
			MethodOverloading s = new MethodOverloading();
			System.out.println(s.sum(5, 16));
			System.out.println(s.sum(5, 16, 52));
			System.out.println(s.sum(17.9, 20.2));
		}


}
