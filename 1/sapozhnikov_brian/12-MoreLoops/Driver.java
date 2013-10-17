import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args){
	Loops L = new Loops();
	System.out.println(L.diag(3));
	System.out.println(L.diag(5));
	System.out.println(L.diagWord("hello"));
    }
}
