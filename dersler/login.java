package dersler;

import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

import javax.naming.ldap.Rdn;

public class login {

	public static void main(String[] args) {
    
	Scanner scanner = new Scanner(System.in);
	String k_adi,parola;
	System.out.println("Kullanýcý adinizi giriniz:");
	k_adi = scanner.nextLine();
	System.out.println("parolanizi giriniz:");
    parola = scanner.nextLine();
		if(k_adi.equals("java") && parola.equals("123")) {
			System.out.println("basarili giris yaptiniz.");
		}
		else {
			System.out.println("yanlis kullanici adi veya yanlis parola girdiniz");
		}
		
		
	}
}
