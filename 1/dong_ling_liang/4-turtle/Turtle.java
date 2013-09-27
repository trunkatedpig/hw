public class Turtle {
    private String name;
    private int age, speed;
    
    public Turtle(){
	setname("Harry Potter");
	setage(100);
	setspeed(60);
    }
    public Turtle(String name){
	setname(name);
	setage(100);
	setspeed(60);
    }
    public Turtle(String name, int age, int speed){
	setname(name);
	setage(age);
	setspeed(speed);
    }
    public void setname(String message){
	name=message;
    }
    
}
