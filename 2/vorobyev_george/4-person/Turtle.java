public class Turtle {

    private String name;
    private int age;
    private int speed;

    public void  initTurtle (String n, int a, int s){
	name = n;
	age = a;
	speed = s;
    }
    public Turtle (){
	initTurtle("Fred",5,7);
    }
    public Turtle (String n){
	initTurtle(n,5,7);
    }
    public Turtle (String n, int a, int s){
	initTurtle(n,a,s);
    }

    public void speedUp(int n){
	speed += n;
    }
    public void slowDown(int n){
	speed -= n;
    }
    public void getOlder(){
	age ++;
    }
    public int getSpeed(){
	return speed;
    }
    public int getAge(){
	return age;
    }
    public String getName(){
	return name;
    }
}
