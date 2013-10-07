public class Turtle(){
	private String name;
	private int age;
	private int speed;

	public Turtle(){
		name = "Tom";
		age = 3;
		speed = 10;
	}

	public Turtle(String n, int a, int s){
		name = n;
		age = a;
		speed = s;
	}

	public void speedUp(int u){
		speed = speed + u;
	}

	public void ageUp(){
		age = age ++;
	}

	public String getName(){
		return name;
	}
	
	public int getSpeed(){
		return speed;
	}

	public int getAge(){
		return age;
	}
}
