import java.io.*;
import java.util.*;

public class Driver{
    
    public static void main(String[] args){
	Turtle t, t2;
	t= new Turtle("Zuckers");
	t2= new Turtle("Poppy Seed",1111,-50);
	System.out.println(t.getName());
	System.out.println(t.getAge());
	System.out.println(t.getSpeed());
	System.out.println(t2.getName());
	System.out.println(t2.getAge());
	System.out.println(t.getSpeed());

    }
}
