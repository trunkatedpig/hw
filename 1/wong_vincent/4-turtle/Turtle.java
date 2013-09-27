import java.io.*;
import java.util.*;

public class Turtle {
    private String name;
    private int age,speed;

    public Turtle () {
    
    }
   
    public Turtle (String name) {
	age = 10;
	speed = 20;
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

    public static 