import java.io.*;
import java.util.*;

public class Turtle {
    private String name;
    private int age;
    private int speed;
    /*Wrote the instance variables myself. Wrote the outlines for the constructors myself but I used Justin and Coby's work to help finish those. I used their work to help with the set and get methods. I wrote the speedUp, slowDown, getOlder. Also used today's lesson in the structure of java to capitalize everything correctly. */
    public void setName(String n){
	name = n;
    }

    public void setAge(int m){
	age = m;
    }

    public void setSpeed(int s){
	speed = s;
    }

    public Turtle(){
	setSpeed(60);
	setAge(15);
	setName("Hayley");
    }

    public Turtle(String name){
	setName(name);
	setSpeed(30);
	setAge(10);
    }

    public Turtle (String name, int age, int speed){
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

    public void getOlder(){
	setAge(age + 1);
    }

    public String getName(){
	return "My name is " +  name;
    }

    public int getAge(){
	return age;
    }

    public int getSpeed(){
	return speed;
    }
}
