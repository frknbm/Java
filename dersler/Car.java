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
			System.out.println("kapý sayýsý sadece 2 veya 4 olabilir");
		}
		
		
	}
	public void star() {
		System.out.println("araba caliþtir");
	}
	public void stop() {
		System.out.println("araba durdu");
	}*/
	public void showInfos() {
		System.out.println("arabanýn rengi :"+this.color);
		System.out.println("arabanýn modeli:"+this.model);
		System.out.println("arabanýn motoru:"+this.engine);
		System.out.println("arabanýn kapý sayýsý:"+this.doors);
       
		
	}
	
	
	
	

}
