public class Driver{
    public static void main(String[] args){
	Encode e = new Encode();
	System.out.println((int)'z');
	System.out.println(e.encode("â€œhelloâ€,3) â€“> khoor",3));
	System.out.println(e.encode("â€œabcxyzâ€,3) â€“> defabc",3));
	//doesn't recognize weird characters - not sure why.
	System.out.println(e.encode("hello",13));
    }
}
