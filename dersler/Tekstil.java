package dersler;

public class Tekstil extends Urun{
	
	
	

	private String beden;
	private String turu�z;
	
      
	 
	
	public Tekstil(String urunAdi, int fiyat, String beden, String turu�z) {
		super(urunAdi, fiyat);
		this.beden = beden;
		this.turu�z = turu�z;
	}

	public void showInfos() {
		System.out.println("tekstil sinifi........");
		System.out.println("urun adi:"+this.urunAdi);
		System.out.println("fiyati:"+this.fiyat);
	    System.out.println("bedeni:" + this.beden);
	    System.out.println("turu �zellikleri:" + this.turu�z);
	    System.out.println("\n");
	
	}
	
	
	
	
	
	
	
	

}
