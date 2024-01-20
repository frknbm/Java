package dersler;
class DatabaseManager{
	
	public void TuruDatabase(IDatabase database) {
		database.turu();
	
	}

	public void YazariDatabase(IDatabase database) {
		database.yazari();
	
	}
	public void FiyatiDatabase(IDatabase database) {
		database.fiyati();
	
	}
	public void YazdirDatabase(IDatabase database) {
		database.yazdir();
	
	}

}
public class main3 {

	public static void main(String[] args) {
       
		DatabaseManager manager = new DatabaseManager();
 
		manager.TuruDatabase(new BilimKurgu());
		
		DatabaseManager manager1 = new DatabaseManager();

		manager1.YazariDatabase(new BilimKurgu());
		
		DatabaseManager manager2 = new DatabaseManager();

		manager2.FiyatiDatabase(new BilimKurgu());
		
		DatabaseManager manager3 = new DatabaseManager();
		System.out.println("\n");
		manager3.YazdirDatabase(new BilimKurgu());
		
		manager.TuruDatabase(new Polisiye());
		
		manager1.YazariDatabase(new Polisiye());
		
		manager2.FiyatiDatabase(new Polisiye());
		
		manager3.YazdirDatabase(new Polisiye());
		System.out.println("\n");
		manager.TuruDatabase(new Macera());
		
		manager1.YazariDatabase(new Macera());
		
		manager2.FiyatiDatabase(new Macera());

        manager3.YazdirDatabase(new Macera());		
	}

}
