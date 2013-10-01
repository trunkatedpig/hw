public class Turtle {
    private String turtle;
    private int speed,age;

    public void setturtle(String n){
	turtle = n;
    }
    public void setage(int m){
	age = m;
    }
    public void setspeed(int s){
	speed = s;
    }

    public Turtle() {
	setspeed(10);
	setage(93);
	setturtle("Tom");
    }
    public Turtle(String name){
	setturtle(name);
	setage(7);
	setspeed(11);
    }
    public void SpeedUp(int n){
	setspeed(speed + n);
    }
    public void SlowDown(int n){
	setspeed(speed - n);
    }
    public void GetOlder(){
	setage(age + 1); 
    }

    public String tellname(){
	return turtle;
    }
    public int tellage(){
	return age;
    }
    public int tellspeed(){
	return speed;
    }
}
//worked with Coby//
