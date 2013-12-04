import java.io.*;
import java.util.*;

public class Driver{

    public static void main(String[] args) {
        For f =  new For();
        System.out.println(f.diag(3));
	System.out.println(f.DiagWord("fish"));
	System.out.println(f.fence(5,8));
	System.out.println(f.fence(8,5));
    }
}
