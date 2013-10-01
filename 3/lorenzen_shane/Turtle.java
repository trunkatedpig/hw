import java.io.*;
import java.util.*;

public class Turtle {
    private String name;
    private int speed;
    private int age;
    
    public void setName(String input){
	name=input;
}
    public String getName(){
	return name;
    }

    public void setAge(int input){
	speed=input;
}
    public int getAge(){
	return age;
    }
    public void setSpeed(int input){
	age=input;
}
    public int getSpeed(){
	return speed;
    }
    private void initTurtle(String n, int s, int a){
	setName(n);
	setAge(a);
	setSpeed(s);
 }
    

    public Turtle() {
	initTurtle("John",1,1);
    }
    public Turtle(String n) {
	initTurtle(n,1,1);
    }
    public Turtle(String n, int a, int s){
	initTurtle(n,a,s);
    }
}