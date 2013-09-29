import java.io.*;
import java.util.*;

public class Turtle{
	private String name;
	private int age = 1;
	private int speed = 2;

	public Turtle(){
	    setName("Freddie");
	}
	
	public Turtle(String name){
	    setName(name);
	}

	public Turtle(String name, int age, int speed){
	    setName(name);
	    setAge(age);
	    setSpeed(speed);
	}

    public void speedUp(int n){
	setSpeed(speed + n);
    }

    public void slowDown(int n){
	setSpeed(speed - n);
    }

	public void setName(String n){
		name = n;		
	}

	public void setAge(int a){
		age = a;
	}

	public void setSpeed(int s){
		speed = s;
	}
	
	public String getName(){
		return name;
	}
	
	public int getAge(){
		return age;
	}

	public int getSpeed(){
		return speed;
	}
}

