public class Turtle {
    private String name;
    private int age, speed;

    public Turtle() {
	name="Turtle";
	age=1;
	speed=5;
    }
    public Turtle(String turtleName) {
	age = 1;
	speed = 5;
	name= turtleName;
    }
    public Turtle(String tName,int tAge, int tSpeed) {
	age=tAge;
	speed=tSpeed;
	name=tName;

	
    }

    public void speedUp(int n){
	speed = speed+n;
    }

    public void slowdown(int n){
	speed = speed-n;
    }

    public void getOlder(){
	age = age+1;
    }

}
