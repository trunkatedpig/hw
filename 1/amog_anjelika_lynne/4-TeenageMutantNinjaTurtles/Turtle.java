import java.io.*;
import java.util.*;

public class Turtle{
    private int speed;
    private String name;
    private int age;
<<<<<<< HEAD

    public void setTurtle(){
	
    }
=======
>>>>>>> 609c97f791a335e0b897d843768c7ec2867145d3
   
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

<<<<<<< HEAD
    public void speedUP(int n){
=======
    public void speedUp(int n){
>>>>>>> 609c97f791a335e0b897d843768c7ec2867145d3
	speed=speed+n;   
    }

    public void slowDown (int n){
	speed=speed-n;
    }

    public void getOlder (){
	age=age+1;
    }

<<<<<<< HEAD
    public int speedme (){
	return speed;
    }

    public int ageme (){
	return age;
    }

    public String nameme (){
=======
    public int getSpeed (){
	return speed;
    }

    public int getAge (){
	return age;
    }

    public String getName (){
>>>>>>> 609c97f791a335e0b897d843768c7ec2867145d3
	return name;
    }  

}