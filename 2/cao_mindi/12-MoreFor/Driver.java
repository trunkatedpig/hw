import java.io.*;
import java.util.*;

public class Driver{
    public static void main(String[] args){
	For f;
	f = new For();
	System.out.println(f.diag(5));
	System.out.println(f.diagWord("Jello"));
	System.out.println(f.fence(7, 5));
    }
}
