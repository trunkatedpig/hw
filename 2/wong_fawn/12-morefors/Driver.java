import java.io.*;
import java.util.*;

public class Driver{
    public static void main (String args[]) {
	For a = new For();
	System.out.println(a.diag(3));
	System.out.println(a.diagWord("Hello"));
	System.out.println(a.fence(5,8));
    }
}