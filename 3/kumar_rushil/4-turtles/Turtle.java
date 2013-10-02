import java.io.*;
import java.util.*;

public class Turtle {

    private String name;
    private int age, speed;

    public Turtle (){
	name = "Rushil";
	age = 17;
	speed = 33;
    }

    public Turtle (String who) {
	name = who;
	age = 40;
	speed = 15;
    }

    public Turtle (String who, int old, int fast){
	name = who;
	age = old;
	speed = fast;
    }

    public void speedUp(int n){
	speed = speed + n;
    }
    public void speedDown (int n){
	speed = speed - n;
    }
    public void getOlder (){
	age = age + 1;
    } 
  
    public String getName (){
	return name;
    }
    public int getAge(){
	return age;
    }
    public int getSpeed(){
	return speed;
    }

 }
