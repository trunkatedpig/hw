import java.io.*;
import java.util.*;

public class Turtle {
    private String name;
    private int age;
    private int speed;
    public Turtle() {
	name = "Fluffy";
	age  = 21;
        speed = 9;
    }
    public Turtle(String namen) {
	name=namen;
	age=42;
	speed=12;

    }
    public Turtle(String namen, int agen, int speedn) {
	name=namen;
	speed=speedn;
	age=agen;

    }
    public void speedUp(int n) {
	speed=speed + n;
    }
    public void slowDown(int n) {
	speed=speed - n;
    }
    public void getOlder() {
	age=age+1;
    }
    public String getName() {
	return name;
    }
    public int getAge() {
	return age;
    }
    public int getSpeed() {
	return speed;
    }
}