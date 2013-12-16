import java.util.*;

public class Driver {
    public static void main(String[] args) {
        WordSearch w = new WordSearch();
        
        System.out.println(w);
        w.addHorizontal(0,0,"apples");
        System.out.println(w);
        w.addHorizontal(18,5,"pie");
        System.out.println(w);
        w.addHorizontal(-2,8,"sadness");
        System.out.println(w);
        w.addHorizontal(0,25,"wheeee");
        System.out.println(w);
        w.addHorizontal(13,17,"bworp");
        System.out.println(w);
       
    }
}
