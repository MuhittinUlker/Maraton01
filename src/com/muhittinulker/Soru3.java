package com.muhittinulker;

public class Soru3 {

	public static void main(String[] args) {

		System.out.println(karakterSayici("Bugün güzel bir gün", 'g'));

		System.out.println(karakterSayici("Bugün güzel bir gün", 'x'));

	}
	
	public static int karakterSayici(String metin, char karakter) {
		int sayac=0;
		metin.toLowerCase();
		char[] charMetin = metin.toCharArray();
		for (int i = 0; i < charMetin.length; i++) {
			if (charMetin[i]==karakter) {
				sayac++;
			}
		}
		return sayac;
	}

}
