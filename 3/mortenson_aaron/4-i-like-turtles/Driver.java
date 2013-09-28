import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String args[]) {
        Turtle t,t2,t3;
        t = new Turtle();
        t2 = new Turtle("Jeff");
        t3 = new Turtle("Sherman the Herman", 9001, -2);
        System.out.println(t2.sayName());
        System.out.println(t.sayName());
        System.out.println(t3.sayName());
	System.out.println(t3.sayAge());
	System.out.println(t2.saySpeed());
    }
}
