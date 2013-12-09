import java.util.*;

public class Driver {
    public static void main(String[] args) {
        WordSearch w = new WordSearch();

        w.addWordH(0,5,"RED");
		w.addWordH(3,7,"ORANGE");
		w.addWordH(5,16,"BLUE");
		w.addWordH(7,18,"GREEN");
		w.addWordH(19,5,"PINK");

		w.addWordV(0,5,"RUBY");
		w.addWordV(0,7,"TEAL");
		w.addWordV(5,15,"YELLOW");
		w.addWordV(17,2,"PURPLE");

		w.addWordHRev(15,7,"GRAY");
		w.addWordHRev(2,14,"BLACK");

		w.addWordVRev(4,6,"WHITE");

		w.addWordTRBL(5,0,"MAGENTA");
		w.addWordBLTR(7,1,"PEARL");
		w.addWordTLBR(10,19,"EMERALD");
		w.addWordBRTL(16,18,"ROSE");

		w.fillInBoard();


		System.out.println(w);
    }
}