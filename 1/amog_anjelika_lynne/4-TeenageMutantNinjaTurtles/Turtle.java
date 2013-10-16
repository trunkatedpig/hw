import java.io.*;
import java.util.*;

public class Turtle{
    private int speed;
    private String name;
    private int age;
   
    public Turtle(){
	speed = 5;
	name = "Donatello";
	age = 16;
    }
    public Turtle (String nombre){
	name=nombre;
	speed=5;
	age=16;
    }

    public Turtle (String nombre, int sp, int ag){
	name=nombre;
	speed=sp;
	age=ag;
    }

    public void speedUp(int n){
	speed=speed+n;   
    }

    public void slowDown (int n){
	speed=speed-n;
    }

    public void getOlder (){
	age=age+1;
    }

    public int getSpeed (){
	return speed;
    }

    public int getAge (){
	return age;
    }

    public String getName (){
	return name;
    }  

}