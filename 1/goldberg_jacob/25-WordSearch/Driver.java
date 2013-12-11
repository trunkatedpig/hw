public class Driver{

    public static void main(String[] args){
	WordSearch x = new WordSearch(20,20);
	System.out.println(x);
	System.out.println(x.addWordHR(4, 6, "Hello"));
	System.out.println(x.addWordHR(4, 5, "Hello"));
	System.out.println(x);
	System.out.println(x.addWordDiUR(19, 6, "Whack"));
	System.out.println(x.addWordDiDR(19, 6, "Ain'thappening"));
	System.out.println(x.addWordDiDL(2, 18, "itwork?"));
	System.out.println(x.addWordVD(3, 7, "Jello"));
	System.out.println(x);
	
    } 


}
