public class Driver {
	public static void main(String[] args) {
		WordSearch ws = new WordSearch(10, 10);
		System.out.println(ws + "\n");
		
		//Test invalid inputs
		ws.addWordHorizontal(-1, 0, "hello");
		ws.addWordHorizontal(0, -1, "hello");
		ws.addWordHorizontal(-1, -1, "hello");
		ws.addWordHorizontal(0, 0, "!@#$%");
		ws.addWordHorizontal(10, 0, "hello");
		
		System.out.println(ws + "\n");
		//
		
		ws.addWordHorizontal(0, 0, "hello");
		System.out.println(ws + "\n");
		
		WordSearch ws2 = new WordSearch(ws, 12, 12);
		System.out.println(ws2 + "\n");
		ws2 = new WordSearch(ws2, 10, 10);
		System.out.println(ws2 + "\n");
	}
}