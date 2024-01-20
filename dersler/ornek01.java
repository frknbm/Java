package dersler;

import java.security.DrbgParameters.NextBytes;
import java.text.NumberFormat.Style;
import java.util.Scanner;

public class ornek01 {

	public static void main(String[] args) {

     	Scanner input=new Scanner(System.in);
     	int a,b;
        System.out.println("a ve b sayisini girin:");
		a=input.nextInt();
		b=input.nextInt();
		System.out.println("a sayisi:"+a);
		System.out.println("b sayisi:"+b);
		
		
		String str;
		str=input.next();
		System.out.println(str);
		
		
	}

}
