import java.io.*;
import java.util.*;

public class Turtle{
	private String name;
	private int age = 1;
	private int speed = 2;

	public Turtle(){
            name = "Freddie";
         }
	
	public Turtle(String n){
	    name = n;
        }

	public Turtle(String n, int a, int s){
            name = n;
            age = a;
            speed = s;
        }

        public void speedUp(int n){
            speed = speed + n; 
        }

         public void slowDown(int n){
            speed = speed - n; 
         }

         public void getOlder(){
             age = age + 1;
            
         }
	public void setName(String n){
		name = n;		
	}

	public void setAge(int a){
		age = a;
	}

	public void setSpeed(int s){
		speed = s;
	}
	
	public String getName(){
		return name;
	}
	
	public int getAge(){
		return age;
	}

	public int getSpeed(){
		return speed;
	}
}

