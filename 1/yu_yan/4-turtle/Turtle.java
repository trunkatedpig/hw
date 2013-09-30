import java.io.*;
import java.util.*;

// vanessa yu elise zlotnikova//

public class Turtle { 

    private int speed;
    private int age;
    private String name; 

    ///////////////////

    public Turtle() {
	name = "Dude";
	age = 5;
	speed = 20;
    }
    public Turtle(String n) {
	name = n;
	age = 5;
	speed = 20;
    }
    public Turtle(String n,int a,int s){
	name = n;
	age = a;
	speed = s;
    }

    //////////////////
    
    public void speedUp(int n) {
	speed = speed + n;
    }
    public void slowDown(int n) {
	speed = speed - n;
    }
    public void getOlder(){
	age = age + 1;
    }
    
    /////////////////
    public int getAge(){
	return age;
    }
    public int getSpeed(){
	return speed;
    }
    public String getName(){
	return name;
    }
    ////////////
}
