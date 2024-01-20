package dersler;

import java.util.Scanner;

public class ornek03 {

	public static void main(String[] args) {

		int r;
		double alan,cevre,pi=3.14;
		Scanner input=new Scanner(System.in);
		System.out.println("dairenin yaricapini giriniz:");
		r=input.nextInt();
		alan=(2*pi*r*r);
		cevre=(2*pi*r);
		System.out.println("dairenin alani:"+alan);
		System.out.println("daireni cevresi"+cevre);
		
	}

}
