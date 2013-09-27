import java.io.*;
import java.util.*;

public class Turtle{
	private String name;
	private int age;
	private int speed;

	public Turtle(){
		setName("sadhjksahdsad");
		setAge(1231124);
		setSpeed(2);
	}
	
	public Turtle(String name){
		
	}

	public Turtle(String name, int age, int speed){

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

