import java.io.*;
import java.util.*;

public class turtles {
    public String name;
    public int age;
    public int speed;
    
    public void f () {
    name = "John";
    age = 56;
    speed = 2;
    }

    public void g (String name1) {
    name = name1;
    age = 15;
    speed = 3;
    }

    public void h (int age1, int speed1, String name1) {
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

    public int getSpeed (int speed1) {
	return  speed1;
    }

    public int getAge (int age1) {
        return age1;
    }

    public String getName (String name1) {
	return name1;
    }

}