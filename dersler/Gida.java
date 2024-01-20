package dersler;

public class Gida extends Urun {

	

	private String turu;
	private int gramaj;

	
	
	
	
	public Gida(String urunAdi, int fiyat, String turu, int gramaj) {
		super(urunAdi, fiyat);
		this.turu = turu;
		this.gramaj = gramaj;
	}

	public void showInfo() {
		System.out.println("Gida sinifi ........");
		System.out.println("urun adi:"+this.urunAdi);
		System.out.println("fiyati:"+this.fiyat);
	    System.out.println("turu:" + this.turu);
	    System.out.println("gramaji:" + this.gramaj);
	
	}
	
	
	

}
