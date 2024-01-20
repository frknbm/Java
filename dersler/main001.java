package dersler;

public class main001 {

	

	    public static void main(String[] args) {
	        System.out.println("Üçgen bilgileri: ");
	        Ucgen ucgen = new Ucgen(12,16,20);
	        ucgen.HesapAlani();
	        ucgen.HesapCevresi();

	        
	        
	        System.out.println("*************");

	        System.out.println("Daire bilgileri: ");
	        AFAS daire = new AFAS(9);
	        daire.HesapAlani();
	        daire.HesapCevresi();

	        System.out.println("*************");

	        
	        
	        
	        System.out.println("Kare bilgileri: ");
	        Kare kare = new Kare(4);
	        kare.HesapAlani();
	        kare.HesapCevresi();

	        
	        
	        
	        
	    }
	}


