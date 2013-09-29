 import java.io.*;
 import java.util.*;

 public class Turtle {
     

     /* INSTANCE VARIABLES BELOW*/
     public String name(){
	 String name;
	 name = new String("Name_placeholder");
	 return name;
     }
     
     public int age(){
	 int age;
	 age = -1; //-1 acts as the age placeholder
	 return age;
     }
     
     public int speed(){
	 int speed;
	 speed =  -1; //-1 acts as a placeholder
	 return speed;
     }
     /*END INSTANCE VARIABLES*/
     
     /*CONSTRUCTORS BELOW*/
     public noParam(){
	 //What goes here!?
     }

     public turtle (){
	 setName("Name_placeholder");
	 setAge(4);
	 setSpeed(50);
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
     
     //get methods
     public void getName(){
	 return name;
     }

     public void getSpeed(){
	 return speed;
     }
	 
     public void getAge(){
	 return age;
     }

     /*END METHODS*/
   
 }