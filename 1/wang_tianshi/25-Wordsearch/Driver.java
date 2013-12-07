import java.util.*;


public class Driver {
    public static void main(String[] args) {
        WordSearch w = new WordSearch();
        //System.out.println(w);
        System.out.println(w.addWordDDR(10,10,"FIRSTBLOOD"));
        System.out.println(w.addWordH(3,5,"DOUBLEKILL"));
        System.out.println(w.addWordDUL(9,10,"TRIPLEKILL"));
        System.out.println(w.addWordDDL(10,9,"QUADRAKILL"));
        System.out.println(w.addWordVB(14,18,"PENTAKILL"));
        System.out.println(w.addWordDUR(6,13,"VICTORY"));
        System.out.println(w);

    }

}
