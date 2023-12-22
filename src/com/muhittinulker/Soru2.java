package com.muhittinulker;

public class Soru2 {

	public static void main(String[] args) {
		int[] dizi = { 1, 2, 2, 3, 2, 4, 5, 6 };
		tekrarBul(dizi);
		int[] dizi2 = { 1, 2, 3, 4, 5, 6 };
		tekrarBul(dizi2);
	}

	static void tekrarBul(int[] dizi) {
		int sayac = 1; // sayım yapılırken sayının kendisi dahil edilmediği için 1'den başlatıldı.
		int bulunanSayi = 0;
		for (int i = 0; i < dizi.length; i++) {
			for (int j = 0; j < i; j++) {
				if (dizi[i] == dizi[j]) {
					bulunanSayi = dizi[i];
					sayac++;
					break;
				}
			}
		}
		if (sayac != 1) {
			System.out.println(bulunanSayi + " sayısı: " + sayac + " kez tekrar ediyor.");
		} else {
			System.out.println("Tekrar eden sayı bulunamadı.");

		}
	}

}
