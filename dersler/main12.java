package dersler;

public class main12 {

    public static void main(String[] args) {
        basketbolcu basketbolcu1=new basketbolcu("basketbol\n");
        basketbolcu1.setbilgiAl("100000$ \n", "los angelas lakers\n", "MVP\n","basketbol\n");
        basketbolcu1.yazd�r();
              
        futbolcu futbolcu1=new futbolcu("futbol\n");
        futbolcu1.setbilgiAl("100000� \n", "juventus\n", "sampiyonlarligi\n","futbol\n");
        futbolcu1.yazd�r();
        
        voleybolcu voleybolcu1=new voleybolcu("voleybol\n");
        voleybolcu1.setbilgiAl("100000 tl\n", "eczac�ba��\n", "turkye ligi\n","voleybol\n");
        voleybolcu1.yazd�r();
    }
    
}
