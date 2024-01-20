package dersler;

import java.net.SocketTimeoutException;
import java.util.Scanner;

public class fonksiyonlar {

	public static void faktoriyel() {
     Scanner scanner = new Scanner(System.in);
     int sayi;
     System.out.println("sayi giriniz:");
		
            sayi = scanner.nextInt();
		    int faktoriyel =1;
		    
		    
		    while(sayi>0) {
		    	faktoriyel *=sayi;
		    	sayi--;
		    	
		    	
		    }
		
		System.out.println("faktoriyel=" +faktoriyel);
		
	}
	public static void main(String[] args) {
         
        	faktoriyel();
        	faktoriyel();

	
	
	
		
	}	
		
	}


