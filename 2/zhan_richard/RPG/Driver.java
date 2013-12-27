import java.io.*;
import java.util.*;

public class Driver{
    public static void main(String[] args){ 
	Fence f = new Fence();
	Hero h = new Hero();
	Scanner sc = new Scanner(System.in);
	System.out.print("What is your name brave warrior?: ");
	String nameInput = sc.nextLine();
	h.setName(nameInput);

	GenericRPG g = new GenericRPG(h);
	System.out.println("Welcome to Kongsville!");
	g.village();
    }
}
