package dersler;

import javax.xml.transform.Source;

public class Teknoloji extends Urun{

	

	private String marka;
	private String model;
	
	
	public Teknoloji(String urunAdi, int fiyat, String marka, String model) {
		super(urunAdi, fiyat);
		this.marka = marka;
		this.model = model;
	}

	public void showInfos() {
		System.out.println("teknoloji sinifi........");
        System.out.println("urun adi :"+this.urunAdi);	
        System.out.println("fiyati:"+this.fiyat);
		System.out.println("markasi :" + this.marka);
	    System.out.println("modeli:" + this.model);
	    System.out.println("\n");
	
	}

	
	
	
	
	
}

	
	


