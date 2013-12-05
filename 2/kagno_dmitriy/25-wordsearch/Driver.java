public class Driver{
    public static void main(String[] args){
	
	Wordsearch w = new Wordsearch();
	
	System.out.println(w.AddWordV(3,5,"hello"));
	System.out.println(w.AddWordV(6,15,"hello"));
	System.out.println(w.AddWordV(9,15,"love"));

	System.out.println(w.AddWordH(3,5,"hello"));
	System.out.println(w.AddWordH(4,4,"hello"));
	System.out.println(w.AddWordH(9,13,"hello"));


	System.out.println(w.toString());
    }
}
