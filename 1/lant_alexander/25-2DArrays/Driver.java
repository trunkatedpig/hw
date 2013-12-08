import java.util.*;

public class Driver {
    public static void main(String[] args) {
	WordSearch w = new WordSearch(20,40);
	Random R = new Random();
	System.out.println(w);
	//  AddWord (int r, int c, int dx, int dy, String word)
	// dx: 1 for right, -1 for left, 0 for stationary
	// dy: 1 for down, -1 for up, 0 for stationary
	w.AddWord(10, 10, -1, 0, "caspar");
	w.AddWord(11, 10, 1, 0, "CASPAR");
	//w.AddWord(
	//w.AddWord(
	//w.AddWord(
	w.FillIn();
       	System.out.println(w);


    }

}
