public class Driver{
    public static void main(String[] args){
	
	Wordsearch w = new Wordsearch();
	
	//System.out.println(w.AddWordV(3,5,"hello"));
	//System.out.println(w.AddWordV(18,6,"hello"));
	//System.out.println(w.AddWordV(7,15,"hello"));

	System.out.println(w.AddWordH(3,5,"hello"));
	System.out.println(w.AddWordH(6,6,"hello"));
	System.out.println(w.AddWordH(7,15,"hello"));


	System.out.println(w.toString());
    }
}
