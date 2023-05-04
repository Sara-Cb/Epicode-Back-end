package exercise1;


public class Main {

	public static void main(String[] args) {
		Rettangolo r1 = new Rettangolo(10, 25);
		Rettangolo r2 = new Rettangolo(25, 8);
		

		stampaDueRettangoli(r1,r2);
	}		
		
	
	public static void stampaRettangolo(Rettangolo r) {
			System.out.println("Area del Rettangolo: " + r.calcolaArea());
			System.out.println("Perimetro del Rettangolo: " + r.calcolaPerimetro());
		}
		
		public static void stampaDueRettangoli(Rettangolo r1, Rettangolo r2) {
			stampaRettangolo(r1);
			stampaRettangolo(r2);
			System.out.println("Somma Area dei Rettangolo: " + (r1.calcolaArea() + r2.calcolaArea()));
			System.out.println("Somma Perimetri dei Rettangolo: " + (r1.calcolaPerimetro() + r2.calcolaPerimetro()));
		}
	
	
	

}

