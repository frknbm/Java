package dersler;

import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

import javax.naming.BinaryRefAddr;
import javax.swing.filechooser.FileNameExtensionFilter;

public class hazirlik {

	public static void main(String[] arg) {

 
		Scanner scanner=new Scanner(System.in);
		int a,b,toplam;
		System.out.println("a sayisini girinniz:");
		a=scanner.nextInt();
		System.out.println("a="+a);
		System.out.println("b sayisini giriniz:");
		b=scanner.nextInt();
		System.out.println("b="+b);
		toplam=a+b;
		System.out.println("toplama islemi sonucu:"+toplam);
	
	}

}
