import java.io.*;
import java.util.*;

public class Turtle {
    private String name;
    private int age, speed;
    public Turtle() {
	name = "Bob";
	age = 5;
	speed = 5;
    }
    public Turtle(String n) {
	name = n;
	age = 5;
	speed = 5;
    }
    public Turtle(String n, int a, int s){
	name = n;
	age = a;
	speed = s;
    }
    public void speedUp(int n){
	speed = speed + n;
    }
    public void slowDown(int n){
	speed = speed - n;
    }
    public void getOlder(){
	age = age + 1;
    }
    public int getSpeed(){
	return speed;
    }
    public String getName(){
	return name;
    }
    public int getAge(){
	return age;
    }
    //just so we can print all the info at once
    public String getInfo(){
	return "\n" + getName() + "\nSpeed: " + Integer.toString(getSpeed()) + "\nAge: " + Integer.toString(getAge());
    }
    
}