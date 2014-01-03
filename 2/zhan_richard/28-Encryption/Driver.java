public class Driver{
    public static void main(String[] args){
	Encrypt e = new Encrypt();
	System.out.println(e.encode("hello",13));
	System.out.println(e.encode("hello there!",3));
    }
}
