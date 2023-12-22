package com.muhittinulker;

public class Soru1 {

	public static void main(String[] args) {
		
		cizdir();

	}
	
	
	/**
	 * Program Run:
	 	*******
	 	*******
	 	*******
	 	*******
	 	******
	 	*****
	 	****
	 	***
	 	***		şeklinde çıktı verir.
	 */
	static void cizdir() {
		System.out.println("Program Run:");
	for (int i = 0; i < 8; i++) {
		if (i<4) {
			for (int j = 0; j < 7; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		}
	for (int i = 6; i >= 0; i--) {
		if (i>=3) {
			for (int j = i; j > 0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		else if (i>1) {
			System.out.println("***");
		}
		
	}
		
	
	}

}
