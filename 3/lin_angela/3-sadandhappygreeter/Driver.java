import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {
	Greeter happygreeting, sadgreeting;
        happygreeting = new Greeter();
	sadgreeting = new Greeter();
	System.out.println(happygreeting.greetSad("Edison"));
	System.out.println(sadgreeting.greetHappy("Jenny"));


	
    }
}
