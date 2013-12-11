import java.util.*;
import java.io.*;

public class Driver{

    public static void main(String[] args){

        ArrayLists b = new ArrayLists();

        long start, time;

        start = System.currentTimeMillis();
        b.addTest(1000);
        time = System.currentTimeMillis() - start;
        System.out.println(time);

    }
}