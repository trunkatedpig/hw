import java.io.*;
import java.util.*;

public class Driver{
    public static void main(String[] args){
    	For f = new For();
    	System.out.print(f.diag(6));
    	System.out.print("\n\n\n");
    	System.out.print(f.diagWord("HELLOWORLD"));
    	System.out.print("\n\n\n");
    	System.out.print(f.fence(5,8));
    }
}
