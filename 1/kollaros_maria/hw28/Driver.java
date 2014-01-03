import java.io.*;
import java.util.*;

public class Driver{
    public static void main(String[] args){
	Convert harry = new Convert();
	System.out.println(harry.encode("ABCXYZ",3));
	System.out.println(harry.encode("HELLO",3));
	System.out.println(harry.encode("MARIA",7));
    }
}
