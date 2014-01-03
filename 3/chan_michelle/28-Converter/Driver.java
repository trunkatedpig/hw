import java.io.*;
import java.util.*;

public class Driver{
    public static void main(String[] args){
	Converter m = new Converter();
	System.out.println(m.convert("helloworld", 0));
	System.out.println(m.convert("helloworld", 5));
	System.out.println(m.convert("@#$@hi@#", 0));
	System.out.println(m.convert("@#$@hi@#", 3));
    }
}
			   
