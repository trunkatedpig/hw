import java.util.*;

public class Driver {
    public static void main(String[] args) {
	WordSearch w = new WordSearch();
	w.addWordH(0,5,"suchwow");
	w.addWordH(1,15,"amaze");
	w.addWordH(2,16,"doge");
	w.addWordH(2,15,"hue");
	w.addWordH(3,17,"nope");
	w.addWordH(4,1337,"turkey");
	System.out.println(w);    }
}
