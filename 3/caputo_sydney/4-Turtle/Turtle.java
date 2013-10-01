
import java.io.*;
import java.util.*;

public class Turtle{
    private String name;
    private int age,speed;
    
    private void initTurtle(String n, int a, int s) {
	setName(n);
	setAge(a);
	setSpeed(s);
    }
    



    public Turtle() {
	initTurtle("Hannah",64,5);
    }
    public Turtle(String n) {
	initTurtle(n, 11, 7);
    }
    public Turtle(String n, int a, int s) {
	initTurtle(n, a, s);
    }


    public void setName(String namevalue) {
	name = namevalue;
    }
    public String getName() {
	return name;
    }


    public void setAge(int agevalue) {
	age = agevalue;
    }
    public int getAge() {
	return age;
    }
    public int getOlder(){
	age = age + 1;
	return age;
    }
	

    public void setSpeed(int speedvalue) {
	speed = speedvalue;
    }
    public int getSpeed() {
	return speed;
    }
    public int speedUp(int n){
	speed = speed + n;
	return speed;
    }
    public int slowDown(int n){
	speed = speed - n;
	return speed;
    }

}
  
