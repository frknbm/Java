package dersler;

public class Car {
	//Field,Properties
	private String color;
	private String model;
	private double engine;
	private int doors;
	
	
	public Car (String color,String model,double engine,int doors) {
		
		this.color=color;
		this.model=model;
		this.engine=engine;
		this.doors=doors;
		
	}
	
	/*
	
	
	public void setColor(String color) {
		this.color = color;
		
	}
	public String getColor() {
		return this.color;
	}
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public double getEngine() {
		return engine;
	}
	public void setEngine(double engine) {
		this.engine = engine;
	}
	public int getDoors() {
		return doors;
	}
	public void setDoors(int doors) {
		this.doors = doors;
		
		if(doors==2 || doors==4) {
			this.doors=doors;
		}
		else {
			System.out.println("kap� say�s� sadece 2 veya 4 olabilir");
		}
		
		
	}
	public void star() {
		System.out.println("araba cali�tir");
	}
	public void stop() {
		System.out.println("araba durdu");
	}*/
	public void showInfos() {
		System.out.println("araban�n rengi :"+this.color);
		System.out.println("araban�n modeli:"+this.model);
		System.out.println("araban�n motoru:"+this.engine);
		System.out.println("araban�n kap� say�s�:"+this.doors);
       
		
	}
	
	
	
	

}
