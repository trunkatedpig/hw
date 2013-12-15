import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {
	Greeter a,b;
	a = new Greeter();
	System.out.println(a.happyGreet("Hank"));
	System.out.println(a.sadGreet("John"));
	b = new Greeter("You look nice today", "Wow how tired are you");
	System.out.println(b.happyGreet("Hanklerfish"));
	System.out.println(b.sadGreet("Yeti"));
    }
}
