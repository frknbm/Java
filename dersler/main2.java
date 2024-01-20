package dersler;



public class main2 {

	public static void main(String[] args) {
        

		
		Kitap kitap1 = new Kitap();  
        kitap1.setIsim("Programlama dili");			
		System.out.println("kitabin ismi:" + kitap1.getIsim());
		
		DersKitabi derskitabi1 = new DersKitabi();
		derskitabi1.setKonu("Java dili");
		System.out.println("kitabin konusu:" + derskitabi1.getKonu());
		
		LiseKitabi fiyat1 = new LiseKitabi();
		fiyat1.setFiyat("40 tl");
		System.out.println("kitabin fiyati:"+fiyat1.getFiyat());
		
		
		
		
		
		
		
	}

}
