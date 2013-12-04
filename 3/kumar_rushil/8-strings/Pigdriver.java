import java.io.*;
import java.util.*;
public class Pigdriver{
    public static void main (String[] args){
	Piglatin piglatin;
	piglatin = new Piglatin();
	System.out.println(piglatin.Pigify("hello"));
	System.out.println(piglatin.Pigify("apple"));
	System.out.println(piglatin.Pigify("rushil"));
    }
}
