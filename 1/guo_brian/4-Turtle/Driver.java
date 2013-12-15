import java.io.*;
import java.util.*;

public class Driver {
    public static void main (String[] args) {
	Turtle t;
	t = new Turtle();
	Person p;
	p = new Person("Brian");
	t = p.getPet();
        System.out.println(p.getTurtleSpeed());
    }
}
