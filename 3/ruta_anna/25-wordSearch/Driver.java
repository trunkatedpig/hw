import java.util.*;

public class Driver {
    public static void main(String[] args) {
        WordSearch w = new WordSearch();

		w.addWord(4,5,1,1,"PURPLE");
		w.addWord(17,2,-1,1,"BLUE");
		w.addWord(5,17,-1,1,"GREEN");
		w.addWordH(8,15,"RED");
		w.addWordV(13,14,"ORANGE");
		w.addWordHRev(2,19,"MAGENTA");
		w.addWordVRev(14,0,"TURQUOISE");
		w.addWordTRBL(2,7,"MANGO");
		w.addWordBLTR(19,12,"GRAY");
		w.addWordBRTL(15,3,"BLACK");
		w.addWordTLBR(0,6,"WHITE");
		w.addWordRand("INDIGO");
		w.addWordRand("PINK");
		w.addWordRand("YELLOW");
		System.out.println(w);


		w.fillInBoard();


		System.out.println(w);
    }
}