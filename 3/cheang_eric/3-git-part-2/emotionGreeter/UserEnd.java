import java.io.*;
import java.util.*;

public class UserEnd {
    
    public static void main (String[] args) {
	
	Greeter Func;
	Func = new Greeter();
	
	System.out.println(Func.happySentenceCreation("Homework"));
	System.out.println(Func.sadSentenceCreation("Homework"));
    }


}
