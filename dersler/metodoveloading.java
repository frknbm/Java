package dersler;

public class metodoveloading {
 
	
	public static void skorHesaplama(String name,int skor) {
		System.out.println(name+"isimli oyuncunun puan�:"+skor);
	}
	
	public static void skorHesaplama( int skor) {
		System.out.println("isimsiz oyuncunun puan�:"+skor);
	}
	public static void skorHesaplama(String name) {
		System.out.println(name+ "isimli oyuncunun puan�:0");
	}
	
	public static void main(String[] args) {
       skorHesaplama("furkna", 50);
	   skorHesaplama( 50);
       skorHesaplama("furkan ");   
	}

}
