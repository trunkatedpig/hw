import java.io.*;
import java.util.*;

public class Turtle {
    
    public String name;
    public int age;
    public  int speed;

    public Turtle(){
   
    }

    public Turtle (String name){
	age=1000;
	speed=69;
	    }

    public Turtle(String n, int a, int s){
	name=n;
        age=a;
	speed=s;
	    }


    public void speedUp(int n){
	speed= n+speed;
    }

    public void slowDown(int n){
	speed=speed-n;
    }

    public void getOlder(){
	age= age+1;
    }

    public String getName(){
	return name;
    }

    public int getSpeed(){
	return speed;
    }

    public int getAge(){
	return age;
    }

}
