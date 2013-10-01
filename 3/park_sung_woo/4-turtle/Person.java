import java.io.*;
import java.util.*;

public class Person{
   private String name;
   private Turtle t1;

  public Person(String n){
    name = n;
  } 

  public void setTurtle(Turtle t){
    t1 = t;
  }

  public Turtle getPet(){
    return t1;
  }

  public int getTurtleSpeed(){
    return t1.getSpeed();
  }
}
