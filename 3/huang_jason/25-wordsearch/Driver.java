import java.io.*;
import java.util.*;

public class Driver{

    public static void main(String[] args){

        Wordsearch w = new Wordsearch();

        System.out.println(w);
	System.out.println("----------------" + "\n");

        w.addWordH(1,8,"Word");
        w.addWordH(5,3,"Search");
	w.addWordH(9,6,"Jason");
	w.addWordH(12,5,"Huang");

	System.out.println(w);
    }
}