import java.io.*;
import java.util.*;

public class MoreLoopsDriver {
    public static void main(String[] args){
        MoreLoops L = new MoreLoops();
        System.out.println(L.diag(3));
        System.out.println(L.diag(5));
        System.out.println(L.diagWord("hello"));
	      System.out.println(L.fence(5, 8));
    }
}
