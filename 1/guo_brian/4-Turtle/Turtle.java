import java.io.*;
import java.util.*;

public class Turtle {

    public String name;
    public int age;
    public int speed;

    public Turtle() {
	setName("Shelldon");
	setAge(5);
	setSpeed(4);
    }

    public Turtle(String name) {
	setAge(28);
	setSpeed(6);
	setName(name);
    }
    
    public void setAge (int a){
	age = a;
    }
    
    public void setName (String n){
	name = n;
    }
    
    public void setSpeed (int s){
	speed = s;
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

    public void getolder(){
	setAge(age + 1);
    }
    public void turtlerevealer(){
	System.out.println(speed);
	System.out.println(age);
	System.out.println(name);
    }
    public int returnspeed(){
	return speed;
    }
}
