import java.util.*;
import java.io.*;


public class Driver {
    public static void main(String[] args){
	WordSearch w = new WordSearch(15,40);

<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
	w.loadWords("wordlist");
	System.out.println(w);       
=======
>>>>>>> bf3a700447573c58e6a86a140ca8250ee965929c
	w.AddWordSE(7,9,"sEast");
	w.AddWordSW(7,9,"sWast");
	w.AddWordNE(7,17,"nEast");
	w.AddWordNW(7,17,"nWast");
=======
	//	w.AddWordSW(7,9,"sWast");
	//	w.AddWordNE(7,17,"nEast");
	//	w.AddWordNW(7,17,"nWast");
>>>>>>> c3bb70eaf8cc787b45db278904b82ad4774435e9
	
	//	System.out.println(w);
	
	//	w.fill();
	//      System.out.println(w);
	
<<<<<<< HEAD
=======
	w.loadWords("wordlist");
	System.out.println(w);       
>>>>>>> a16d4eaff2e40dd14fb647c7f97bb4cb1c51c158
=======
<<<<<<< HEAD
>>>>>>> 102f62e2395367dd85aa22a5f72d106331ea491c
=======

	w.loadWords("wordlist");
	w.fill();
	System.out.println(w);       

>>>>>>> c3bb70eaf8cc787b45db278904b82ad4774435e9
>>>>>>> bf3a700447573c58e6a86a140ca8250ee965929c
    }
}
