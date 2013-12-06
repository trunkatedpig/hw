import java.util.*;


public class Driver {
    public static void main(String[] args) {
	WordSearch w = new WordSearch();

	w.addWordH(1,9,"LongWord");
	w.addWordH(5,2, "snowflake");
	w.addWordH(5,6, "flakes");
	w.addWordH(5,1, "notsnow");
	//	System.out.println(w);
	w.addWordV(17,3, "Notgoingtowork");
	//w.addWordV(3,2,"pls");
	w.addWordV(3,3,"vvvvvvvvvv");
	w.addWordRevH(8,2,"live");
	w.addWordRevH(19,19,"evil");
	w.addWordRevH(5,10,"vvvvvvvv");
	System.out.println(w);
	//System.out.println(w.addWordRevV(5,0,"raceeeeeeee"));
	//System.out.println(w.addWordRevV(5,0,"raceee"));
	w.addWordRevV(7,
	System.out.println(w);
    }

}
