import java.io.*;
import java.util.*;

public class Turtles {

    private String name;
    private int age,speed;

    
    public void speedUp(int n){
	speed = speed + n;
    }

    public void slowDown(int n){
	speed = speed - n;
    }

    public void getOlder(){
	age = age + 1;
    }

    public String getname(){
        return name;
    }

    public int  getAge(){
	return age;
    }

    public int getSpeed(){
	return speed;
    }
}
    


