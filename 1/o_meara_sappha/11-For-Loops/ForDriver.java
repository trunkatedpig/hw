import java.io.*;
import java.util.*;

public class ForDriver {
    public static void main(String[] args) {
	For forloop = new For();
	System.out.println(forloop.fact(5));
	System.out.println(forloop.StringReverse("Hey Adriana"));
	System.out.println("-----------------------------");
	System.out.println(forloop.table(3, 5));
    }
}
