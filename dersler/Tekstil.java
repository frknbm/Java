package dersler;

public class Tekstil extends Urun{
	
	
	

	private String beden;
	private String turuöz;
	
      
	 
	
	public Tekstil(String urunAdi, int fiyat, String beden, String turuöz) {
		super(urunAdi, fiyat);
		this.beden = beden;
		this.turuöz = turuöz;
	}

	public void showInfos() {
		System.out.println("tekstil sinifi........");
		System.out.println("urun adi:"+this.urunAdi);
		System.out.println("fiyati:"+this.fiyat);
	    System.out.println("bedeni:" + this.beden);
	    System.out.println("turu özellikleri:" + this.turuöz);
	    System.out.println("\n");
	
	}
	
	
	
	
	
	
	
	

}
