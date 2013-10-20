import java.io.*;
import java.util.*;

public class Driver{
    public static void main(String[] args){
	Pictures p = new Pictures();
	System.out.println(p.addSpaces(3));
	System.out.println(p.diag(4));
	System.out.println(p.diagWord("hello"));
	System.out.println(p.fence(6,8));
    }
}
