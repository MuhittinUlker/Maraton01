package com.muhittinulker;

public class Soru4 {

	public static void main(String[] args) {

		String metin = "merhaba Dünya";
		System.out.println(CustomStringTR.buyukHarfeCevir(metin));
		System.out.println("**********************************");
		System.out.println();
		metin = "MERHABA dÜNYA";
		System.out.println(CustomStringTR.kucukHarfeCevir(metin));
		System.out.println("**********************************");
		System.out.println();

		// indexOf: birden çok kez var ise
		metin = "merhaba";
		System.out.println("Aranan karakter " + CustomStringTR.karakterIndexi(metin, 'a'));
		System.out.println("**********************************");
		System.out.println();

		// indexOf: bir tane var ise
		metin = "merhaba";
		System.out.println("Aranan karakter " + CustomStringTR.karakterIndexi(metin, 'm'));
		System.out.println("**********************************");
		System.out.println();

		// indexOf:bulunamadı ise
		metin = "merhaba";
		System.out.println("Aranan karakter " + CustomStringTR.karakterIndexi(metin, 'j'));
		System.out.println("**********************************");
		System.out.println();

		// concat
		String metin1 = "merhaba";
		String metin2 = "dünya";
		System.out.println(CustomStringTR.metinEkleme(metin1, metin2));
		System.out.println("**********************************");
		System.out.println();

		// String ifade verilen karakter ile başlıyorsa = true
		metin = "merhaba";
		System.out.println(CustomStringTR.ileBasliyorMu(metin, 'm'));
		System.out.println("**********************************");
		System.out.println();

		// String ifade verilen karakter ile başlamıyorsa = false
		metin = "merhaba";
		System.out.println(CustomStringTR.ileBasliyorMu(metin, 'x'));
		System.out.println("**********************************");
		System.out.println();

		// String ifade verilen karakter ile bitiyorsa = true
		metin = "merhaba";
		System.out.println(CustomStringTR.ileBitiyorMu(metin, 'a'));
		System.out.println("**********************************");
		System.out.println();

		// String ifade verilen karakter ile bitmiyorsa = false
		metin = "merhaba";
		System.out.println(CustomStringTR.ileBitiyorMu(metin, 'x'));
		System.out.println("**********************************");
		System.out.println();

		// equals-true
		metin1 = "merhaba";
		metin2 = "merhaba";
		System.out.println(CustomStringTR.metinlerEsitMi(metin1, metin2));
		System.out.println("**********************************");
		System.out.println();

		// equals--false
		metin1 = "merhaba";
		metin2 = "dunya";
		System.out.println(CustomStringTR.metinlerEsitMi(metin1, metin2));
		System.out.println("**********************************");
		System.out.println();

		// repeat
		metin = "merhaba";
		System.out.println(CustomStringTR.tekrarla(metin, 3));
		System.out.println("**********************************");
		System.out.println();

		// replace
		metin = "merhaba";
		System.out.println(CustomStringTR.degistir(metin, 'a', 'e'));
		System.out.println("***********************************");
		System.out.println();

		// charAt
		metin = "merhaba";
		System.out.println(CustomStringTR.indextekiKarakteri(metin, 0));
		System.out.println("***********************************");
		System.out.println();
	}

}
