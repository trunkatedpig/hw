import java.io.*;
import java.util.*;

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
    public void setage(int message){
	age=message;
    }
    public void setspeed(int message){
	speed=message;
    }
    public void speedup(int n){
	speed= speed + n;
    }
    public void slowdown(int n){
	speed= speed - n;
    }
    public void getolder(){
	age= age + 1;
    }
    public int getspeed(){
	return speed;
    }
    public int  getage(){
	return age;
    }
    public String  getname(){
	return name;
    }
    public String getinfo(){
	return "My name is " + name + "/n" + "My speed is " + Integer.toString(speed) + "/n" + "My age is " + Integer.toString(age);
    }

}
