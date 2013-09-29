import java.io.*;
import java.util.*;

public class Driver {

    public static void main(String[] arg) {

	Turtle t = new Turtle();
	Turtle t2 = new Turtle("Tommy");
	Turtle t3 = new Turtle("Spongebob", 1, 2);
	
	System.out.println(t.getName() t.getAge() t.getSpeed());
	System.out.println(t2.getName() t2.getAge() t2.getSpeed());
	System.out.println(t3.getName() t3.getAge() t3.getSpeed());
    }

}