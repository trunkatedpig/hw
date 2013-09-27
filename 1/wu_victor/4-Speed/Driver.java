import java.io.*;
import java.util.*;

public class Driver {

    public static void main(String[] args){
	Turtle t,t2,t3;
	t = new Turtle();
	t2 = new Turtle("David");
	t3 = new Turtle("Vic", 5, 10);
	System.out.println(t.gName());
	System.out.println(t.gSpeed());
	System.out.println(t.gAge());
	System.out.println(t2.gName());
	System.out.println(t2.gSpeed());
	System.out.println(t2.gAge());
	System.out.println(t3.gName());
	System.out.println(t3.gSpeed());
	System.out.println(t3.gAge());
    }
}

