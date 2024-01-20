package dersler;

public class futbolcu extends sporcu {
	public futbolcu(String brans1) {
        branþ=brans1;

}
    
    public void setbilgiAl(String maas1 , String klub1 , String basarisi1,String brans1){
    maas=maas1;
    klub=klub1;
    baþarisi=basarisi1;
    branþ=brans1;

    }
    public void yazdýr(){
    System.out.println("oyuncunun branþi:"+branþ+ "maaþý=" +maas+"kulubü:"+klub +"baþarýsý:"+baþarisi+"branþi:"+branþ);
    
    }
}
