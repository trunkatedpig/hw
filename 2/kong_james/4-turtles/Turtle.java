/*Worked with Victor Gaitour*/
import java.io.*;
import java.util.*;

public class Turtle {
    public String name;
    public int age;
    public int speed;
    
    public void speedUp(int n){
	speed = n + speed;
    }
    public void slowDown(int n){
	speed = n - speed;
    }
    public void getOlder(){
	age = age + 1;
    }
    public int getSpeed(){
	return speed;
    }
    public int getAge(){
	return age;
    }
    public String getName(){
	return name;
    }
    public Turtle(){
	name = "Turtle";
	speed= 20;
	age= 3;
    }
    public Turtle(String n){
	name = n;
	age= 4;
	speed = 10;
    }
    public Turtle(String n, int a, int s){
	name = n;
	age = a;
	speed = s;
    }
    
}
