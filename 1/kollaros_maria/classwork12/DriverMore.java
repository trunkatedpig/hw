import java.io.*;
import java.util.*;

public class DriverMore{
    public static void main(String[] args){
	More yoda = new More();
	System.out.println(yoda.diag(5));
	System.out.println(yoda.diagWord("hello"));
	System.out.println(yoda.fence(5,4));
	System.out.println(yoda.diag(7));
	System.out.println(yoda.diagWord("happy"));
	System.out.println(yoda.fence(8,9));
    }
}
