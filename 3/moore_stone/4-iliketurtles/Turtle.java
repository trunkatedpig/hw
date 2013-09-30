import java.io.*;
import java.util.*;

public class Turtle {
    private String name;
    private int age;
    private int speed;

    public String sayName() {
        return name;
    }

    public int sayAge() {
        return age;
    }

    public int saySpeed() {
	return speed;
    }

    public Turtle() {
	name="Bobert the Turtle";
        age=60;
        speed=7;
    }

    public Turtle(String turtName) {
        name=turtName;
        age=60;
        speed=7;
    }

    public Turtle(String turtName, int turtAge, int turtSpeed) {
	name=turtName;
	age=turtAge;
	speed=turtSpeed;
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
}
