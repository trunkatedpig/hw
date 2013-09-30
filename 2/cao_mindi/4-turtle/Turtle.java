import java.io.*;
import java.util.*;

public class Turtle{

    private int speed;
    private String name;
    private int age;


    public Turtle(){
	age = 7;
	speed = 5;
	name = "Bob";
    }

    public Turtle(String n){
	age = 7;
	speed = 5;
	name = n;
    }

    public Turtle(String n, int a, int s){
	age = a;
	name = n;
        speed = s;
    }


    public void speedUp(int n){
	speed = speed + n;
    }

    public void slowDown(int n){
	speed = speed - n;
    }

    public void getOlder(){
	age = age + 1;
    }

    public int getAge(){
	return age;
    }

    public String getName(){
	return "my name is " + name;
    }

    public int getSpeed(){
	return speed;
    }
}
