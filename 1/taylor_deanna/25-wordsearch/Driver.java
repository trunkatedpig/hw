import java.util.*;

public class Driver{
    public static void main(String args[]){
	Wordsearch w = new Wordsearch(20, 20);
	w.toString();
	w.insertWordV(5, 5, "hello");
	w.insertWordH(6, 5, "howdy");
	System.out.println(w);
    }
}
