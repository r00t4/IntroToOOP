import java.util.Vector;
  
public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello world!");
		
		int x = 10;
		boolean isOk = true;
		double d = 1.1;
		char c = 'c';
		float f = 1.200f;
		String str = new String("123");
		
		int[] arr = {1,2,3,4,5};
		
		int[] arr2 = new int[5];   
		
		
		Vector v = new Vector<Integer>();

		for(int i=0; i<x; i++) {
			v.add(i);
		}
		
		System.out.println(v);
		
		
//		switch (x) {
//			case (1):
//				System.out.println(" 1");
//				break;
//			case (3):
//				break;
//			default:
//				System.out.println("default");
//				break;
//		}
			
		String st = new String("bmw");
		Car bmw = new Car(st, "black", x, 150);
		System.out.println("Name: " + bmw.name);
		bmw.name = "X5";
		System.out.println("Name: " + bmw.name);
		bmw.setSpeed(150);
		int speed = bmw.getSpeed();
		System.out.println("Speed: " + speed);
		
//		if (x == 10 && x ==11) {
//			System.out.println();
//		}
	}
}

class Car {
	
	public String name;
	public String color;
	private int price;
	private int speed;
	
	
	public Car() {
		this.name = "";
		this.speed = 0;
		this.color = "";
		this.price = 0;		
	}
	
	public Car(String name, String color, int price) {
		this();
		this.name = name;
		this.color = color;
		this.price = price;
	}
	
	public Car(String name, String color, int price, int speed) {
		this.name = name;
		this.speed = speed;
		this.color = color;
		this.price = price;
	}
	
	public int getSpeed() {
		return this.speed;
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
}
