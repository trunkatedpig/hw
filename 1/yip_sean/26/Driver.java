public class Driver {
	public static void main(String[] args) {
		WordSearch ws = new WordSearch(10, 10);
		System.out.println(ws + "\n");
		
		//Test invalid inputs
		try {ws.addWordHorizontal(-1, 0, "hello");}
		catch (ArrayIndexOutOfBoundsException e) {System.out.println(e);}
		
		try {ws.addWordHorizontal(0, -1, "hello");}
		catch (ArrayIndexOutOfBoundsException e) {System.out.println(e);}
		
		try {ws.addWordHorizontal(-1, -1, "hello");}
		catch (ArrayIndexOutOfBoundsException e) {System.out.println(e);}
		
		ws.addWordHorizontal(0, 0, "!@#$%");
		
		try {ws.addWordHorizontal(10, 0, "hello");}
		catch (ArrayIndexOutOfBoundsException e) {System.out.println(e + "\n");}
		
		System.out.println(ws + "\n");
		//
		
		//ws.addWordHorizontal(0, 0, "hello");
		//ws.addWordVertical(0, 0, "hello");
		//ws.addWord(1, "yolo");
		ws.addWord(5, 5, 2, "hello");
		ws.addWord(9, 9, 4, "yolo");
		//ws.addWord(5, 5, 5, "damn");
		
		ws = new WordSearch(10, 10);
		ws.addWord(5, 5, 6, "damn");
		//ws = new WordSearch(10, 10);
		//ws.addWord(5, 5, 7, "damn");
		ws = new WordSearch(10, 10);
		ws.addWord(5, 5, 8, "damn");
		System.out.println(ws + "\n");
		
		
	}
}
