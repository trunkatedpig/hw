public class Driver{

    public static void main(String[] args){
	WordSearch x = new WordSearch(20,20);
	System.out.println(x);
	x.addWordV(4, 6, "Bye");
	System.out.println(x);
	x.addWordH(12, 6, "Hello");
	System.out.println(x);
	x.addWordV(3, 1, "Homie");
	System.out.println(x);
	
    } 


}
