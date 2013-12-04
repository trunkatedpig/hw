import java.io.*;
import java.util.*;

public class Driver {
    public static void main ( String[] args ) {
	arrays2 a = new arrays2();
	System.out.println ( Arrays.toString ( a.RevFill ( 5 ) ) );
	System.out.println ( Arrays.toString ( a.MakeRandom ( 5 , 2 , 9 ) ) );
        int[] oneArray = { 13 , 2 , 3 , 12 , 1 , 13 , 2 , 4 }  ;
	int[] anotherArray = { 2 , 3 , 5 , 7 , 9 };
	int[] lastArray = { 2 , 3 , 5 , 4 };
	System.out.println ( a.sum13 ( oneArray ) );
	System.out.println ( a.modThree ( anotherArray ) );
	System.out.println ( a.modThree ( lastArray ) );
    }
}
