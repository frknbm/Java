package dersler;

public class retrunfonksiyonörenk {

	public static int ucilecarp(int a) {
		return a*3;
	
	}
	public static int ikitopla(int a) {
	  return a+2;
	
	}
	public static int dortcikar(int a) {
		return a-4;
	}
	
	public static void main(String[] args) {
     System.out.println("sonuç:"+dortcikar(ikitopla(ucilecarp(4))));

	}

}
