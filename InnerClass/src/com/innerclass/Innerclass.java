package com.innerclass;

public class Innerclass {

		private int numberOfFruits=40;
		
		class SourFruit{
			void taste() {
				System.out.println("I am sour and my count is"+(numberOfFruits-20));
			}
		}
		
		class SweetFruit{
			void taste() {
				System.out.println("I am sweet and my count is"+(numberOfFruits-15));
			}
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub

			Innerclass f= new Innerclass();
			
			
		Innerclass.SourFruit sof=  f.new SourFruit();//will not know about sweet fruit
		Innerclass.SweetFruit swef=  f.new SweetFruit();//will not know about sour fruit
		
		System.out.println("sourfruit"+  sof);
		System.out.println("sweetfruit" + swef);
		}

	}


