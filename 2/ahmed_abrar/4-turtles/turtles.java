import java.io.*;
import java.util.*;

public class turtles {
    public String name;
    public int age;
    public int speed;
    
    public turtles () {
	name = "John";
	age = 56;
	speed = 2;
    }

    public turtles (String name1) {
    name = name1;
    age = 15;
    speed = 3;
    // return "Name:" + name + "\nAge:" + age + "\nSpeed:" + speed;
    }

    public turtles (int age1, int speed1, String name1) {
    age = age1;
    speed = speed1;
    name = name1;
    }     

    public void speedUp (int n) {
	speed = speed + n;
    }

    public void slowDown (int n) {
	speed = speed - n;
    }

    public void getOlder () {
	age = age + 1;
    }

    public int getSpeed () {
	return speed;
    }

    public int getAge (int age1) {
        return age;
    }

    public String getName (String name1) {
	return name;
    }
    public String ret() {
	return "Name:" + name + "\nAge:" + age + "\nSpeed:" + speed;
    }
}
