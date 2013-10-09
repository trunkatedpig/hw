public class Turtle(){
	private String name;
	private int age;
	private int speed;

	public Turtle(){
		name = "Tom";
		age = 3;
		speed = 10;
	}

	public Turtle(String n){
		name = n;
		age = 3;
		speed = 10;
	}

	public Turtle(String n, int a, int s){
		name = n;
		age = a;
		speed = s;
	}

	public void SpeedUp(int u){
		speed = speed + u;
	}

	public void GetOlder(){
		age = age ++;
	}

	public String tellname(){
		return name;
	}
	
	public int tellspeed(){
		return speed;
	}

	public int tellage(){
		return age;
	}
}
