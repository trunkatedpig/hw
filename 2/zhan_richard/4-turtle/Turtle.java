public class Turtle{
    public String name;
    public int age, speed;
    
    public Turtle(){
	name = "Bob";
	age = 2;
	speed=10;
    }

    public Turtle(String n){
	name=n;
	age=2;
	speed=10;
    }

    public Turtle(String n, int a, int s){
	name = n;
	age = a;
	speed = s;
    }
    //METHODS
    public void speedUp(int n){
	speed = speed + n;
    }
    public void slowDown(int n){
	speed = speed - n;
    }
    public void getOlder(){
	age = age + 1;
    }
    public String message;
    public String getSpeed(){
	message = "Speed: " + speed;
	return message;
    }
    public String getName(){
	message = "Name: " + name;
	return message;
    }
    public String getAge(){
	message = "Age: " + age;
	return message;
    }
}
