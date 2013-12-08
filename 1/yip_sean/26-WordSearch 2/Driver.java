public class Driver {
	public static void main(String[] args) {
		WordSearch ws = new WordSearch(10, 10);
		System.out.println(ws + "\n");
		
		System.out.println("Testing invalid inputs:");
		ws.addWord(-1, 0, 0, "yolo");
		ws.addWord(11, 0, 0, "yolo");
		ws.addWord(0, -1, 0, "yolo");
		ws.addWord(0, 11, 0, "yolo");
		ws.addWord(-1, -1, 0, "yolo");
		ws.addWord(11, 11, 0, "yolo");
		ws.addWord(0, 0, -1, "yolo");
		ws.addWord(0, 0, 9, "yolo");
		ws.addWord(0, 0, 0, "!@#$");
		ws.addWord(0, 0, 0, "");
		System.out.println("\n" + ws + "\n");
		
		String[] messages = new String[] {"Random", "Horizontal", "Horizontal reversed", "Vertical", "Vertical reversed", "Diagonal left", "Diagonal left reversed", "Diagonal right", "Diagonal right reversed"};
		for (int i = 0; i <= 8; i++) {
			System.out.println(messages[i] + ":");
			ws = new WordSearch(10, 10);
			ws.addWord(5, 5, i, "yolo");
			System.out.println(ws + "\n");
		}
		
		ws.fillGrid();
		System.out.println(ws);
	}
}