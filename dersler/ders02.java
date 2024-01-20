package dersler;

import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

import javax.naming.BinaryRefAddr;

public class ders02 {

	public static void main(String[] args) {

		
		Scanner scan =new Scanner(System.in);

		float a,b;
		System.out.println("a sayisini giriniz:");
		a= scan.nextFloat();
		System.out.println("b sayisini giriniz:");
		b=scan.nextFloat();
		
		
		System.out.println(a+b);
		
		int c,d;
		System.out.println("c sayisiin giriniz:");
		c=scan.nextInt();
		
		System.out.println("d sayisini girin");
		d=scan.nextInt();
		
		System.out.println(d*c);
		
		
		
		String isim;
		System.out.println("isminizi girin:");
		isim=scan.next();
		System.out.println(isim);
	}

}
