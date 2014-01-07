import java.io.*;
import java.util.*;
public class Driver {
    public static void main (String[] args){
	Rot Testing = new Rot();
	System.out.println(Testing.encode("Hello World!!", 13));
	System.out.println(Testing.encode("uryyb jbeyq!!", 13));
    }
}