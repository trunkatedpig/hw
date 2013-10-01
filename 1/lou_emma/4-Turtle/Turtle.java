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

    public void speedUP(int n){
	speed=speed+n;   
    }

    public void slowDown (int n){
	speed=speed-n;
    }

    public void getOlder (){
	age=age+1;
    }

    public int speedme (){
	return speed;
    }

    public int ageme (){
	return age;
    }

    public String nameme (){
	return name;
    }  

}
