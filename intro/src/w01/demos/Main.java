package w01.demos;

public class Main {

	public static void main(String[] args) {

		String ortaMetin = "İlginizi çekebilir";
		String altMetin = "Vade Süresi";

		System.out.println(ortaMetin);

		int vade = 12;
		double dolarDun = 18.90;
		double dolarBugun = 18.55;
		boolean dolarDustuMu = false;

		String okYonu = "";

		if (dolarBugun < dolarDun) {

			okYonu = "down.svg";
			System.out.println(okYonu);

		} else if (dolarBugun > dolarDun) {

			okYonu = "up.svg";
			System.out.println(okYonu);

		} else {

			okYonu = "equal.svg";
			System.out.println(okYonu);

		}

		String[] krediler = { "Hizli Kredi", "Maasini Bankadan", "Mutlu emekli kaldi mi?" };

		for (int i = 0; i < krediler.length; i++) {
			System.out.println(krediler[i]);
		}

	}
}
