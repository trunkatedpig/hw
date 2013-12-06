import java.util.*;


public class Driver {
    public static void main(String[] args) {
        WordSearch w = new WordSearch();
        //System.out.println(w);
        //xSystem.out.println(w.addWordDDR(0,3,"FIRSTBLOOD"));
        //System.out.println(w.addWordDDL(4,12,"DOUBLEKILL"));
        System.out.println(w.addWordHB(10,9,"TRIPLEKILL"));
        System.out.println(w.addWordVB(18,0,"QUADRAKILL"));
        //System.out.println(w.addWordDUL(15,12,"PENTAKILL"));
        System.out.println(w.addWordDUR(201,1,"VICTORY"));
        System.out.println(w);

    }

}