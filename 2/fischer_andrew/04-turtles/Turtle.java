//Worked with Sam Kim

 import java.io.*;
 import java.util.*;

 public class Turtle {
     

     /* INSTANCE VARIABLES BELOW*/
    private String name;
    private int age;
    private int speed; 
     /*END INSTANCE VARIABLES*/
     
     /*CONSTRUCTORS BELOW*/


     public Turtle() {
	 }
	 
	 public Turtle(String input_name) {
		 name = input_name;
		 age = (int)(4);
		 speed = (int)(7);
	 }
	 
	 public Turtle(String input_name, int input_age, int input_speed) {
		 name = input_name;
		 age = input_age;
		 speed = input_speed;
	 }
     /*END CONSTRUCTORS*/

     /*METHODS BELOW*/
     public void speedUp(int n){
	 speed = (speed + n);
     }

     public void slowDown(int n){
	 speed = (speed - n);
     }

     public void getOlder(){
	 age = (age + 1);
     }
	 /*END METHODS*/
     
     //get methods
     public String getName(){
		 return name;
     }

     public int getSpeed(){
		 return speed;
     }
	 
     public int getAge(){
		 return age;
     }

     /*END METHODS*/
   
 }