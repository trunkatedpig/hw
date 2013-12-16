import java.util.*;

public class Driver{
    public static void main(String args[]){
        Wordsearch w = new Wordsearch();
        w.toString();
        w.insertWordH(2, 3, "hello");
        System.out.println(w);
    }
}