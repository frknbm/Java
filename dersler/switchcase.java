package dersler;

import java.util.Scanner;

public class switchcase {

	public static void main(String[] args) {
     
	    Scanner scan = new Scanner(System.in);
		System.out.println("bir sayi girinz:");
		int sayi = scan.nextInt();

		switch(sayi) {
		case 1: 
			System.out.println("sayi 1 dir.");
		break;
		case 2: 
			System.out.println("sayi 2 e esittir.");
		break;
		case 3: 
			System.out.println("sayi 3e esittir");
		break;
		default :
			System.out.println("gecersiz sayi girdiniz.");
		
		}
		
	}

}
