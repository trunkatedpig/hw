import java.io.*;
import java.util.*;

public class Driver{

    public static void main(String[] args){

        ArrayStuff c = new ArrayStuff();

        System.out.println("Array: " + c);
        System.out.println("Max number: " + c.get(c.findMaxIndex()));
        System.out.println("Average: " + c.mean());
        System.out.println("Standard Deviation: " + c.stddev());

    }

}