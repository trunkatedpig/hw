// Worked with Danny Qiu

import java.io.*;
import java.util.*;

public class Turtle {

    private String name;
    private int age;
    private int speed;

    public Turtle() {
    }

    public Turtle(String input_name) {
	name = input_name;
	age = (int) (Math.random() * 100.0);
	speed = (int) (Math.random() * 10.0);
    }

    public Turtle(String input_name, int input_age, int input_speed) {
	name = input_name;
	age = input_age;
	speed = input_speed;
    }

    public void speedUp(int n) {
	speed = speed + n;
    }

    public void slowDown(int n) {
	speed = speed - n;
    }

    public void getOlder() {
	age++;
    }

    public String getName() {
	return name;
    }
    public int getSpeed() {
	return speed;
    }
    public int getAge() {
	return age;
    }
}
