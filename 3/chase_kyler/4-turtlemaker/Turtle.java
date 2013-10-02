import java.io.*;
import java.util.*;

public class Turtle {
	private String Name;
	private int Age;
	private int Speed;

	public Turtle(String name) {
		setAge(20);
		setSpeed(5);
		setName(name);
	}
	public Turtle(int a, int s, String name ){
		setAge(a);
		setSpeed(s);
		setName(name);
	}
	public Turtle(){
		setAge(20);
		setSpeed(5);
		setName("Larry");
	}

	public void speedUp(int n){
		Speed = Speed + n;
	}

	public void slowDown(int n) {
		Speed = Speed - n;
	
	}
	
	public void getOlder() {
		Age = Age + 1;
	}

	public void setAge(int a) {
		Age = a;
	}

	public void setSpeed(int s) {
		Speed = s;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getSpeed() {
		return Speed;

	}

	public String turtleMaker() {
		String output;
		output ="Name: " + Name + " Age: " + Age + " Speed: " + Speed;
		return output;
	}

}










