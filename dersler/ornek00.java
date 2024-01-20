package dersler;

import java.util.Scanner;

import javax.lang.model.element.NestingKind;

public class ornek00 {

	public static void main(String[] args) {

		
		int a,b;
		Scanner scanner= new Scanner(System.in);
	    System.out.println("a sayisini giriniz:");
	    a=scanner.nextInt();
	    System.out.println("b sayisini giriniz:");
	    b=scanner.nextInt();
		int toplam,cikarma,carpma,bolme,mod;
		toplam=a+b;
		cikarma=a-b;
		carpma=a*b;
		bolme=a/b;
		mod=a%b;
		System.out.println("toplama islemi sonucunuz:"+toplam);
		System.out.println("cikarma islemi sonucunuz:"+cikarma);
		System.out.println("carpma islemi sonucunuz:"+carpma);
		System.out.println("bolme islemi sonucunuz:"+bolme);
		System.out.println("mod alma islemi sonucunuz:"+mod);
		
		
		
		
		int d,e;
		d=5;
		e=25;
		boolean durum=(d==e);
		System.out.println(durum);
		 
		
		
		
		
		
	}

}
