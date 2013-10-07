import java.io.*;
import java.util.*;

public class Turtle {
    private String name;
    private int speed, age;

    public Turtle (){
	name = "Ishmam";
	age = 5;
	speed = 2;
    }
    public Turtle (String var){
	name = var;
	age = 6;
	speed = 3;
    }
    public Turtle (String name2, int age2, int Speed2){
	name= name2;
	age = age2;
	speed = Speed2;
    }
    //methods
    public void speedUp(int n){
	speed += n;
    }
    public void slowDown (int n){
	speed -= n;
    }
    public void getOlder() {
	age += 1;
    }
    //get methods (for speed name and age)
    public String getname(){
	return name;
    }
    public int getage(){
	return age;
    }
    public int getspeed(){
	return speed;
    }






}

