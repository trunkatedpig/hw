public class Driver {
    public static void main(String[] args){
	Rot r = new Rot();
	System.out.println(r.rotter("a.b,c,y?z.",13));
	r.buildCorpusFreq("englishbook.txt");
	System.out.println(r.toString());
    }
}
