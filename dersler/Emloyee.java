package dersler;

public class Emloyee {
	private String name;
	private String departman;
    private int salary;
	public Emloyee(String name, String departman, int salary) {
		super();
		this.name = name;
		this.departman = departman;
		this.salary = salary;
	}
	
	public void showInfos() {
		System.out.println("bilgiler....");
		System.out.println("isim: "+this.name);
		System.out.println("departman: "+this.departman);
		System.out.println("isim: "+this.salary);

	}

}
