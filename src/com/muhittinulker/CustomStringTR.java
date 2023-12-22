package com.muhittinulker;

public class CustomStringTR {

	public static String buyukHarfeCevir(String metin) {
		String METIN = "";
		metin.toCharArray();
		for (int i = 0; i < metin.length(); i++) {
			if (Character.isLowerCase(metin.charAt(i))) {
				char karakter = metin.charAt(i);
				karakter = (char) (karakter - 32);
				METIN += karakter;
			} else {
				METIN += metin.charAt(i);
			}
		}
		return METIN;
	}

	public static String kucukHarfeCevir(String METIN) {
		String metin = "";
		METIN.toCharArray();
		for (int i = 0; i < METIN.length(); i++) {
			if (Character.isUpperCase(METIN.charAt(i))) {
				char karakter = METIN.charAt(i);
				karakter = (char) (karakter + 32);
				metin += karakter;
			} else {
				metin += METIN.charAt(i);
			}
		}
		return metin;
	}

	/**
	 * String olarak verilen metin içerisinde aranan karakter parametresi var ise
	 * index değer/lerini yok ise "bulunamadı" değerini döndürür. (indexOf)
	 * 
	 * @param metin
	 * @param karakter
	 * @return
	 */
	public static String karakterIndexi(String metin, char karakter) {
		metin.toCharArray();
		String index = "";
		for (int i = 0; i < metin.length(); i++) {
			if (metin.charAt(i) == karakter) {
				index = index + i + ". ";
				continue;
			}
		}
		if (index != "") {
			return index + " indexte bulundu.";
		} else {
			return "bulunamadı.";
		}

	}

	/**
	 * Verilen String parametreleri birbirine ekleyerek geri döndürür (concat)
	 * 
	 * @param metin1
	 * @param metin2
	 * @return
	 */
	public static String metinEkleme(String metin1, String metin2) {
		return metin1 + metin2;
	}

	/**
	 * Verilen String parametre verilen char parametre ile başlıyor ise true
	 * başlamıyor ise false döndüren metod.
	 * 
	 * @param metin
	 * @param karakter
	 * @return
	 */
	public static boolean ileBasliyorMu(String metin, char karakter) {

		if (metin.charAt(0) == karakter) {
			return true;
		}
		return false;
	}

	/**
	 * Verilen String parametre verilen char parametre ile bitiyor ise true bitmiyor
	 * ise false döndüren metod.
	 * 
	 * @param metin
	 * @param karakter
	 * @return
	 */
	public static boolean ileBitiyorMu(String metin, char karakter) {

		if (metin.charAt(metin.length() - 1) == karakter) {
			return true;
		}
		return false;
	}

	public static boolean metinlerEsitMi(String metin1, String metin2) {
		boolean esitMi = false;
		if (metin1.length() != metin2.length()) {
			esitMi = false;
		} else {
			for (int i = 0; i < metin1.length(); i++) {
				if (metin1.charAt(i) == metin2.charAt(i)) {
					esitMi = true;

				} else {
					esitMi = false;
				}
			}
		}
		return esitMi;
	}

	public static String tekrarla(String metin, int sayi) {
		String yeniMetin = "";
		for (int i = 0; i < sayi; i++) {
			yeniMetin += metin;
		}
		return yeniMetin;
	}

	public static String degistir(String metin, char ilk, char son) {
		String yeniMetin = "";
		metin.toCharArray();
		for (int i = 0; i < metin.length(); i++) {
			if (metin.charAt(i) == ilk) {
				yeniMetin += son;
			} else {
				yeniMetin += metin.charAt(i);
			}
		}

		return yeniMetin;
	}

	public static char indextekiKarakteri(String metin, int index) {
		char karakter = ' ';
		char[] charDizisi = metin.toCharArray();
		karakter = charDizisi[index];
		return karakter;
	}
}
