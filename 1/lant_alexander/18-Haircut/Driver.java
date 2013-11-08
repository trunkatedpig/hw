import java.io.*;
import java.util.*;

public class Driver{
    public static void main(String[] args){
	
	Haircut h = new Haircut();

	System.out.println(h.RevFill(10));
	System.out.println(h.MakeRandom(10, 2, 9));
	
    }

}