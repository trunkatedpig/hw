import java.io.*;
import java.util.*;

public class Turtle {

    private String name;
    private int age;
    private int speed;

    public Turtle() {
	setName("Brian Guo");
	setAge(16);
	setSpeed(7);
    }

    public Turtle(String name) {
	setSpeed(1000);
	setAge(18);
	setName(name);
    }
    
    public void setSpeed(int s){
	speed = s;
    }
    
    public void setAge (int a){
	age = a;
    }
    
    public void setName (String n){
	name = n;
    }

    public Turtle (String n, int a, int s){
	setName(n);
	setAge(a);
	setSpeed(s);
    }
    
    public void speedUp(int n){
	setSpeed(speed + n);
    }

    public void slowDown(int n){
	setSpeed(speed - n);
    }

    public void getOlder(){
	setAge(age + 1);
    }

    public String turtleName(){
	return name;
    }

     public int turtleAge(){
	return age;
    }

     public int turtleSpeed(){
	return speed;
    }

}
