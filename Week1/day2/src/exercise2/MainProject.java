package exercise2;

public class MainProject {

	public static void main(String[] args) {

		CartaSIM s1 = new CartaSIM("123456789");
		s1.ricaricaSim(10);
		s1.effettuaChiamata(new Chiamata("3296530", 5));
		s1.effettuaChiamata(new Chiamata("9783952", 2));
		s1.effettuaChiamata(new Chiamata("1243512", 4));
		s1.stampaDatiSIM();

	}

}
