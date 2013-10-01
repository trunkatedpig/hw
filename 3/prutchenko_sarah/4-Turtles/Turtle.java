public class Turtle {
    private String name;
    private int age, speed;

    public Turtle(String tName) {
	age = 1;
	speed = 5;
	name= tName;
    }
    public Turtle(String tName,int tAge, int tSpeed) {
	age = tAge;
	speed = tSpeed;
	name = tName;	
    }

    public void speedUp(int n) {
	speed = speed+n;
    }

    public void slowDown(int n) {
	speed = speed-n;
    }

    public void GetOlder() {
	age = age+1;
    }
    public int getAge(){
	return age;
    }
    public String getName(){
	return name;
    }
    public int getSpeed(){
	return speed;
    }


}
