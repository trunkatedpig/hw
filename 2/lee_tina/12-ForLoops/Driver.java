//Tina Lee and Kelly Chen
import java.io.*;
import java.util.*;

public class Driver{
    public static void main (String [] args){
	Diagonals d;
	d = new Diagonals();

	System.out.println(d.diag(7));
	System.out.println(d.diagWord("hello"));
	System.out.println(d.fence(6, 8));
    }
}
