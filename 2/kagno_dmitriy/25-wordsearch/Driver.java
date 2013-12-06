public class Driver{
    public static void main(String[] args){
	
	Wordsearch w = new Wordsearch();
	
	System.out.println(w.AddWordH(0,0,"Jamie"));
	System.out.println(w.AddWordHback(1,0,"Jamie"));
	System.out.println(w.AddWordV(2,0,"Jamie"));
	System.out.println(w.AddWordVback (3,1,"Jamie"));
	System.out.println(w.AddWordD(4,2,"Jamie"));
	System.out.println(w.AddWordDback(5,7,"Jamie"));
	System.out.println(w.AddWordDr(6,11,"Jamie"));
	System.out.println(w.AddWordDrback(7,17,"Jamie"));
	


	System.out.println(w.toString());
    }
}
