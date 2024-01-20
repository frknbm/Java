package dersler;

import java.util.Scanner;

public class ornek02 {

	public static void main(String[] args) {

		
		int a,b,c,ort;
		Scanner input=new Scanner(System.in);
		System.out.println("vizenizi giriniz:");
		a=input.nextInt();
		System.out.println("proje notunuzu giriniz:");
		b=input.nextInt();
		System.out.println("odev notunuzu giriniz:");
	    c=input.nextInt();
	    ort=(a+b+c)/3;
	    System.out.println("ortalamaniz:"+ort);
	    
	   String sonuc = (ort<=50)? "kaldiniz": "gectiniz";
	   System.out.println(sonuc);
		
	}

}
