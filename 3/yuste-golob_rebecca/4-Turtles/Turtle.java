import java.io.*;
import java.util.*;

public class Turtle {
    private String name;
    private int age, speed;
    
    public void setname(String w){
	name = w;
    }
    public void setage(int a){
	age = a;
    }
    public void setspeed(int s){
	speed = s;
    }

    public Turtle(){
	setname("Jean Valjean");
	setage(64);
	setspeed(10);
    }
    public Turtle(String nomen){
	setname(nomen);
	setage(16);
	setspeed(2);
    }
    public Turtle(String nombre, int i, int h){
	setname(nombre);
	setage(i);
	setspeed(h);
    }

    public void speedUp(int n){
	speed = speed + n;
    }
    public void slowDown(int n){
	speed = speed - n;
    }
    public void getOlder(){
	age = age - 1;
    }

    public String tellname(){
	return "Name: " + name;
    }
    public int tellage(){
	return age;
    }
    public int tellspeed(){
	return speed;
    }
}
