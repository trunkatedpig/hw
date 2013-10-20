public class Driver{
    public static void main(String args[]){
	Diag d = new Diag();
	System.out.println(d.diag(5));
	System.out.println(d.diag(3));
	System.out.println(d.diagWord("Eric is cool"));
	System.out.println(d.fence(5,8));
	System.out.println(d.fence(8,6));
    }
}
