import java.util.*;

public class Driver {
    public static void main(String[] args) {
        WordSearch w = new WordSearch();

        System.out.println(w);
        System.out.println();

        w.addWordH(0,5,"RED");
		w.addWordH(3,7,"ORANGE");
		w.addWordH(5,16,"BLUE");
		w.addWordH(7,18,"GREEN");
		w.addWordH(19,5,"PINK");

		w.addWordV(0,5,"RUBY");
		w.addWordV(0,7,"TEAL");
		w.addWordV(5,15,"YELLOW");
		w.addWordV(17,2,"PURPLE");

		System.out.println(w);
    }
}