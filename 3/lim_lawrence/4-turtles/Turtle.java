//George Drimba
////Lawrence Lim

import java.io.*;
import java.util.*;

public class Turtle {
    ////made these private
    private String name;
    private int age, speed;
    
    public Turtle () {
        setName("Shelly");
        setSpeed(73);
        setAge(12);
    }
    public Turtle (String TurtleName) {
        setSpeed(73);
        setAge(12);
        setName(TurtleName);
    }

    //Methods is what you call these right ??
    ////yes
    public void speedUp(int n) {
        speed = speed + n;
    }
    public void slowDown(int n) {
        speed = speed - n;
    }
    /*I think that for get older we can't do add n,
      it must be some specific number*/

    public void getOlder()	{
	age = age + 1;
    }

    // Set methods
    public void setName(String n) {
        name = n;
    }
    public void setAge(int a) {
        age = a;
    }
    public void setSpeed(int s) {
        speed = s;
    }

    // Here is the get  methods that we started working on
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public int getSpeed() {
	return speed;
    }

    public void printTurtle() {	
        System.out.println("name:  "+getName());
        System.out.println("age:   "+getAge());
        System.out.println("speed: "+getSpeed());
	System.out.println();
    }
}
