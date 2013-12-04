import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {
        myList L = new myList();
	L.insert(3,8);
	System.out.println(L.toString());
	L.remove(3);
	System.out.println(L.toString());
	L.fremove(3);
	System.out.println(L.toString());
        
    }  
}      

