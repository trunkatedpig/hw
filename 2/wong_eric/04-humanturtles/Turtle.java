import java.io.*;
import java.util.*;

//Worked with Terrance Liang

public class Turtle{
    public String name;
    public int age,speed;

    public Turtle() {
	name = "Franklin";
	age = 3;
	speed = 2;
    }
    public Turtle(String n) {
	name = n;
	age = 4;
	speed = 1;
    }
    public Turtle(String n,int a,int s) {
	name = n;
	age = a;
	speed = s;
    }

    public void speedUp(int n) {
	speed = speed + n;
    }
    public void slowDown(int n) {
	speed = speed - n;
    }
    public void getOlder() {
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
    public String getInfo(){
	return "The Turtle's name is " + name +"\n"+ "Its speed is " + speed + "\n" + "Its age is " + age + "\n";

    }
}
