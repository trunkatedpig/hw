import java.io.*;
import java.util.*;

public class Turtle {

    private String name;

    private int age;

    private int speed;

    public  Turtle(){
	this.name = "Victor";
	this.age = 1;
	this.speed = 3;
    }
    public Turtle (String name) {
	this.name=name;
	this.age = 1;
	this.speed = 3;
    }
    public Turtle(String name, int age, int speed){
	this.name=name;
	this.age=age;
	this.speed=speed;
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
    public String getName(){
	return name;
    }
    public int getAge(){
	return age;
    }
    public int getSpeed(){
	return speed;
    }}
