import java.io.*;
import java.util.*;

public class Turtles {
    //Instance Variables;
    private String name;
    private int age,speed;

    //Constructor with no parameters;
    public void Turtle (){
	name = "Udyr";
	age = 20;
	speed = 10;
    }
    
    //Constructor with name parameter;
    public void Turtle (String n){
	name = n;
	age = 25;
	speed = 30;
    }
    
    //Constructor with all three accepted parameters
    public void Turtle (String n, int a, int s){
	name = n;
	speed = s;
	age = a;
    }
	
    //methods;
    public void speedUp(int n){
	speed = speed + n;
    }

    public void slowDown(int n){
	speed = speed - n;
    }

    //getmethods;
    public void getOlder(){
	age = age + 1;
    }

    public String getname(){
        return name;
    }

    public int  getAge(){
	return age;
    }

    public int getSpeed(){
	return speed;
    }
}
    


