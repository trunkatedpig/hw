import java.util.*;
import java.io.*;


public class Driver {
    public static void main(String[] args){
	//uncoment yes and no for filled in or not
	WordSearch w = new WordSearch(15,15);
	//it's a problem, I can't solve my own word search
	 w.autoFill(10,"no");
	 //w.autoFill(10,"yes");
	System.out.println(w);

    }
}
