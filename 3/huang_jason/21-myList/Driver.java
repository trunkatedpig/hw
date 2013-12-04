import java.io.*;
import java.util.*;

public class Driver{

    public static void main(String[] args){

        myList l = new myList(12,24);
        Random r = new Random();

        System.out.println(l);
        System.out.println(l.remove(9));
        System.out.println(l);
        
    }
}