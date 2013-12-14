import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {

Turtle victor = new Turtle();
System.out.println("turtle name is: "+victor.getName() + victor.getAge() + victor.getSpeed());
Turtle david=new Turtle("David", 16, 100);
System.out.println("turtle name is: "+david.getName() +david.getAge() + david.getSpeed());
    david.speedUp(100);

System.out.println("turtle name is: "+david.getName() +david.getAge() + david.getSpeed());
if (david.getSpeed()==200) {
    System.out.println("test successful");

}

Person pavel = new Person("Pavel");
pavel.setTurtle(victor);
System.out.println ("===============");
System.out.println(pavel.getTurtleSpeed());


        }
}
