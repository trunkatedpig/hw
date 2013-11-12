import java.io.*;
import java.util.*;

public class Turtle {
    public String name;
    public int age, speed;

    public Turtle() {
        setName("Default");
        setAge(0);
        setSpeed(1);
    }

    public Turtle(String n) {
        setName(n);
        setAge(0);
        setSpeed(1);
    }

    public Turtle(String n, int a, int s) {
        setName(n);
        setAge(a);
        setSpeed(s);
    }

    public void setName(String n) {
        name = n;
    }

    public void setAge(int a) {
        age = a;
    }

    public void setSpeed(int s) {
        speed = s;
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

    public void speedUp(int n) {
        speed = speed + n;
    }

    public void slowDown(int n) {
        speed = speed - n;
    }

    public void getOlder () {
        age = age + 1;
    }

}

