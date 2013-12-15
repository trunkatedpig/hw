import java.util.*;
import java.io.*;
public class Driver {
    public static void main(String[] args) {
	WordSearch w = new WordSearch();
	Random r = new Random();
	int n, row, col;
	boolean b;
	
//	System.out.println(w);
	//System.out.println(w.addWordH(3,17,"hello"));
	/*System.out.println(w.addWordH(3,12,"hello"));
//	System.out.println(w);
	System.out.println(w.addWordV(2,13,"world"));
	System.out.println(w.addWordV(2,16,"world"));
//	System.out.println(w);
	System.out.println(w.addWordDL(12,8,"hello"));
	System.out.println(w.addWordDR(12,4,"hello"));
	w.fillBoard();
	System.out.println(w);
*/
	try {
	File file = new File("wordlist");
	Scanner sc = new Scanner(file);
	ArrayList<String> wordlist = new ArrayList<String>();
	ArrayList<String> words = new ArrayList<String>();
	while (sc.hasNext())
		wordlist.add(sc.nextLine());
	for (int i = 0; i<wordlist.size(); i++) {
		n = r.nextInt(8);
		b = false;
		try {
		if (n == 1) {
			while (b == false) {	
				row = r.nextInt(20);
				col = r.nextInt(20);
				b = w.addWordH(row, col, wordlist.get(i));
			}
		}
		if (n == 2) {
			while (b == false) {	
				row = r.nextInt(20);
				col = r.nextInt(20);
				b = w.addWordHBack(row, col, wordlist.get(i));
			}
		}
		if (n == 3) {
			while (b == false) {	
				row = r.nextInt(20);
				col = r.nextInt(20);
				b = w.addWordV(row, col, wordlist.get(i));
			}
		}
		if (n == 4) {
			while (b == false) {	
				row = r.nextInt(20);
				col = r.nextInt(20);
				b = w.addWordVBack(row, col, wordlist.get(i));
			}
		}
		if (n == 5) {
			while (b == false) {	
				row = r.nextInt(20);
				col = r.nextInt(20);
				b = w.addWordUL(row, col, wordlist.get(i));
			}
		}
		if (n == 6) {
			while (b == false) {	
				row = r.nextInt(20);
				col = r.nextInt(20);
				b = w.addWordDL(row, col, wordlist.get(i));
			}
		}
		if (n == 7) {
			while (b == false) {	
				row = r.nextInt(20);
				col = r.nextInt(20);
				b = w.addWordUR(row, col, wordlist.get(i));
			}
		}
		if (n == 0) {
			while (b == false) {	
				row = r.nextInt(20);
				col = r.nextInt(20);
				b = w.addWordDR(row, col, wordlist.get(i));
			}
		}
		words.add(wordlist.get(i));
		}
		catch (Exception e) {}
	}
	for (int i = 0; i<words.size(); i++)
		System.out.println(words.get(i));
	}
	catch (Exception e) {}
	System.out.println(w);
	w.fillBoard();
	System.out.println(w);

       
    }
}
