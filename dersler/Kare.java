package dersler;

public class Kare implements Calculation {
    int kareKenar;
    
    
    

    public Kare(int kareKenar){
        this.kareKenar = kareKenar;
    }
    
    
    
    
    
    
    @Override
    public void HesapCevresi() {
        int cevre = this.kareKenar*4;
        System.out.println("Karenin kenarý : " + cevre);
    }
    
    
    
    
    
    @Override
    public void HesapAlani() {
        int alan = this.kareKenar*this.kareKenar;
        System.out.println("Karenin kenarý: " + alan);
    }
}

