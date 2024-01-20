package dersler;

import javax.management.remote.SubjectDelegationPermission;

public class Urun {
   
	 String urunAdi;
	 int fiyat;
	
	public Urun(String urunAdi, int fiyat) {
		this.urunAdi = urunAdi;
		this.fiyat = fiyat;
	}
	

	public void showInfos() {
	    System.out.println("Urun adi:" + this.urunAdi);
	    System.out.println("fiyati:" + this.fiyat);
	}
	
	
	
	public void Kdv() {
		System.out.println("KDV dahildir"+this.fiyat);
		
	}
	
	
	      
	
}
