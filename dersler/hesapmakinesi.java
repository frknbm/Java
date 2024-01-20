package dersler;

import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

public class hesapmakinesi {

	
	
	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		int sayi1,sayi2,secim;
		System.out.println("ilk sayiyi giriniz:");
		sayi1 = scanner.nextInt();
		System.out.println("ikinci sayiyi giriniz:");
		sayi2 = scanner.nextInt();
		System.out.println(" lutfen yapmak istediginiz islemi seciniz:");
		System.out.println("1-toplama \n2-cikarma \n3-carpma \n4-bolme \n5-mod alma");
		System.out.println("seciminiz:");
        secim =scanner.nextInt();
        if(secim==1) {
        	System.out.println("toplama islemi sonucunuz:"+(sayi1+sayi2));
        }
        else if(secim==2) {
        	System.out.println("cikarma islemi sonucunuz:"+(sayi1-sayi2));
        }
        else if(secim==3) {
        	System.out.println("carpma islemi sonucunuz:"+(sayi1*sayi2));
        }
        else if(secim==4){
        	if(sayi2==0) {
        		System.out.println("sayi2 0a esittir.sonuc belirsizdir");
        	}
        	else {
        		System.out.println("bolme islemi sonucunuz:"+(sayi1/sayi2));
        	}
        }
        else if(secim==5) {
        	System.out.println("mod alma islemi sonucunuz:"+(sayi1%sayi2));	
        }
        else {
        	System.out.println("yanlis secim yaptiniz tekrar islem seciniz.");
        }
        
	
	}
	
	
}


