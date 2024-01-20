package dersler;

import java.util.Scanner;

public class sýnýfatlama {

	public static void main(String[] args) {

        int turkce,matematik,fenBilgisi,sosyalBilgisi;
		
		Scanner scanner =new Scanner(System.in);
        System.out.println("turkce notunu giriniz:");
		turkce = scanner.nextInt();
        System.out.println("matematik notunu giriniz:");
        matematik = scanner.nextInt();
        System.out.println("fenbilgisi notunu giriniz:");
		fenBilgisi =scanner.nextInt();
		System.out.println("sosyalbilgisi notunu giriniz:");
		sosyalBilgisi =scanner.nextInt();
		int ort=(fenBilgisi+matematik+turkce+sosyalBilgisi)/4;
		if(ort<=50) {
			System.out.println("ort" +ort);
			System.out.println("kaldiniz");
		}
		else {
			System.out.println("ort="+ort);
			System.out.println("geçtiniz");
		}
		
	}

}
