package Maraton.Soru4;

public class Daire {

	double a;
	
	String daireAlan(double a) {

		double i =  (Math.PI*a*a);
		
			return "Dairenin Alanı " +i ;
		
	}
	
	String daireÇevre(double a) {
		
		double j = (a*2*Math.PI);
		return "Dairenin Çevresi "+ j;
				
	}

}
