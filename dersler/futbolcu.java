package dersler;

public class futbolcu extends sporcu {
	public futbolcu(String brans1) {
        bran�=brans1;

}
    
    public void setbilgiAl(String maas1 , String klub1 , String basarisi1,String brans1){
    maas=maas1;
    klub=klub1;
    ba�arisi=basarisi1;
    bran�=brans1;

    }
    public void yazd�r(){
    System.out.println("oyuncunun bran�i:"+bran�+ "maa��=" +maas+"kulub�:"+klub +"ba�ar�s�:"+ba�arisi+"bran�i:"+bran�);
    
    }
}
