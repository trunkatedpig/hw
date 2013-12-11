import java.util.*;


public class Driver {
    public static void main(String[] args) {
        WordSearch w = new WordSearch();

        w.addWordH(1,9,"LongWord");
        w.addWordH(5,2, "snowflake");
        w.addWordH(5,6, "flakes");
        w.addWordH(5,1, "notsnow");
        w.addWordV(17,3, "Notgoingtowork");
        w.addWordV(0,19,"wvvvvvvvvv");
        w.addWordRevH(8,2,"live");
        w.addWordRevH(19,19,"evil");
        w.addWordRevH(5,10,"vvvvvvvv");
        w.addWordRevV(5,0,"raceeeeeeee");
        w.addWordRevV(5,0,"raceee");
        w.addWordRevV(8,10,"cake");
	w.addWordDR(17,17,"NOPENOTFIT");
	w.addWordDR(14,3,"Should");
	w.addWordUR(12,17,"cantsee");
	w.addWordUR(16,8,"tuna");
	w.addWordUR(8,0,"soon");
	w.addWordUR(8,1,"soon");
        System.out.println(w);
    }

}
