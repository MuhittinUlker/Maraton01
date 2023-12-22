package com.muhittinulker;

import java.util.Scanner;

public class Soru5 {

	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int secim = 0;
		do {

			menuYazdir();
			secim = kullanicidanVeriAl();
			geometrikHesaplayici(secim);

		} while (secim != 7);

	}

	static void menuYazdir() {
		System.out.println("*************************");
		System.out.println("**Geometrik Hesaplayıcı**");
		System.out.println("*************************");
		System.out.println("1-Kare alan hesaplama");
		System.out.println("2-Kare çevre hesaplama");
		System.out.println("3-Dikdörtgen alan hesaplama");
		System.out.println("4-Diktörtgen çevre hesaplama");
		System.out.println("5-Daire alan hesaplama");
		System.out.println("6-Daire çevre hesaplama");
		System.out.println("7-Çıkış");

	}

	static int kullanicidanVeriAl() {
		System.out.println("Seçiminizi girin:");
		int secim = scanner.nextInt();
		return secim;
	}

	static void geometrikHesaplayici(int secim) {

		switch (secim) {
		case 1:
			System.out.print("Kare kenar uzunluğunu girin: ");
			int kenar = scanner.nextInt();
			int alan = kenar * kenar;
			System.out.println("Kare alanı: " + alan);

			break;
		case 2:
			System.out.print("Kare kenar uzunluğunu girin: ");
			kenar = scanner.nextInt();
			int cevre = kenar * 4;
			System.out.println("Kare çevresi: " + cevre);
			break;
		case 3:
			System.out.print("Dikdörtgen kısa kenar uzunluğunu girin: ");
			int kisaKenar = scanner.nextInt();
			System.out.print("Dikdörtgen uzun kenar uzunluğunu girin: ");
			int uzunKenar = scanner.nextInt();
			alan = kisaKenar * uzunKenar;
			System.out.println("Dikdörtgen alanı: " + alan);
			break;
		case 4:
			System.out.print("Dikdörtgen kısa kenar uzunluğunu girin: ");
			kisaKenar = scanner.nextInt();
			System.out.print("Dikdörtgen uzun kenar uzunluğunu girin: ");
			uzunKenar = scanner.nextInt();
			cevre = ((kisaKenar * 2) + (uzunKenar * 2));
			System.out.println("Diktörtgen çevresi: " + cevre);
			break;
		case 5:
			System.out.println("Daire yarı çapını girin: ");
			double r = scanner.nextDouble();
			double daireAlan = Math.PI * r * r;
			System.out.println("Dairenin alanı: " + daireAlan);
			break;
		case 6:
			System.out.println("Daire yarı çapını girin: ");
			r = scanner.nextDouble();
			double daireCevre = 2 * Math.PI * r;
			System.out.println("Dairenin Çevresi: " + daireCevre);
			break;
		case 7:
			System.out.println("Çıkış yapıldı.");
			break;

		default:
			System.out.println("1-7 arası bir seçim giriniz");
			break;
		}

	}
}
