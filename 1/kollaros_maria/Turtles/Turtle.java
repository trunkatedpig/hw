import java.io.*;
import java.util.*;

public class Turtle {
    private String name;
    private int age;
    private int speed;

    public Turtle(){
    }

    public Turtle(String name){
	age = 10;
	speed = 50;
    }
    
    public Turtle(String name, int age, int speed){

    }

    public void speedUp(int n) {
	speed = speed + n;
    }

    public void slowDown(int n){
	speed = speed - n;
    }

    public void getOlder(){
	age = age + 1;
    }

    public String greet(String name) {
	String message;
	message = "Hi my name is " + name;
	return message;
    }

}
