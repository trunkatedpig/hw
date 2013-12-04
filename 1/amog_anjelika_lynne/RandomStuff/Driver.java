import java.io.*;
import java.util.*;

public class Driver {
    public static void main (String[] args){
	Triangle tri = new Triangle();
	System.out.println(tri.trianglify(5, "c"));
	System.out.println(tri.trianglify2(5, "G"));
    }
}