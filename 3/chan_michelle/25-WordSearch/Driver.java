import java.util.*;


public class Driver {
    public static void main(String[] args) {
        WordSearch test = new WordSearch();

        System.out.println(test.addWordH(1,3,"supercalifragilicious"));
        System.out.println(test.addWordH(5,2, "sunshine"));
        System.out.println(test.addWordH(6,6, "trees"));
        System.out.println(test);
    }

}
