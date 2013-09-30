//Kelly Chen and Tina Lee

import java.io.*;
import java.util.*;

public class Turtle {
    //INSTANCE VARIABLES:
    private String name;
    private int age;
    private int speed;

    //CONSTRUCTORS:
    //if there no imputs
    public Turtle(){
	name = "Sheldon";
	age = 7;
	speed = 5;
    }	

    //accepts name only
    public Turtle(String n){
	name = n;
	age = 8;
	speed = 10;
    }

    //accepts name, age, speed
    public Turtle (String n1, int a, int s){
	name = n1;
	age = a;
	speed = s;
    }
 
    //METHODS:
    public void speedUp(int n){
	speed = speed + n;
    }

    public void slowDown(int n){
	speed = speed - n;
    }

    public void getOlder(){
	age = age +1;
    }

    //GET METHODS:
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


