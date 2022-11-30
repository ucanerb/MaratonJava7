package Maraton.Soru1;

public class Yildizlar {
	
	
	
	public static void yildizYaz() {
		int i;
		int k;
        int sembol=7;
        int dön =7;
        int sayac=0;
        
        for(k=0; k<7; k++) {
        	if (sayac<=3) {
            
        		for (i=0; i <dön; i++)
        		{
            	System.out.print("* ");

                sayac++;
        		}
        }
        	else {
        		for (i=0; i <sembol; i++)
        	{
               
              	System.out.print("* ");
                	    
            }
        	}
            System.out.println("");
            sembol--;
        }
}
}
