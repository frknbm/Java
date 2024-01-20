package dersler;

public class Kitap {

	private String isim;
	
	
	public void setIsim(String yeniIsim) {
		this.isim = yeniIsim;
	}
	public String getIsim() {
		return this.isim;
	}
	public void ciktiYaz() {
		System.out.println("Ýsim: "+this.isim);
	}
	
	
}
