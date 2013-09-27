import java.io.*;
import java.util.*;

public class Turtle {
    
    private String name;
    private int age;
    private int speed;


    private void setVar (String n, int a, int s) {
	name = n;
	age = a;
	speed = s;
    }
    public Turtle () {
	setVar ("Bob", 1, 3);
    }
    public Turtle (String name) {
	setVar (name, 1, 3);
    }
    public Turtle (String name, int a, int s) {
	setVar (name, a, s);
    }

    public String gName () {
	String rn;
	rn = name + " ";
	return rn;
    }
    public int gSpeed () {
	int rs;
	rs = speed;
	return rs;
    }
    public int gAge () {
	int ra;
	ra = age;
	return ra;
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

}
 

