package Maraton.Soru4;

public class Dikdörtgen {

	double a;
	double b;
	
	String dörtgenAlan(double a, double b) {

		double	i = a*b;
		
			return "Dikdörtgenin alanı : "+ i;
		
	}
	
	String dörtgenÇevre(double a, double b) {
		
		double j = 2*(a+b);
		return "Dikdörtgenin Çevresi : "+ j;
				
	}

}
