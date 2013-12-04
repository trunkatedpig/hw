import java.util.*;
import java.io.*;

public class Driver{
    public static void main (String[] args){
	Loops x = new Loops();
	System.out.println(x.diag(5));
	System.out.println("===============");
	System.out.println(x.word("asdf"));
	System.out.println("===============");
	System.out.println(x.fence(1,1));
	System.out.println("===============");
	System.out.println(x.fence(10,10));
    }
}
