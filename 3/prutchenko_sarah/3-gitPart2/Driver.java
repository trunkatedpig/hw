public class Driver{
    public static void main(String args[]){
	Greeter g, g2;
	String result;
	g= new Greeter();
	g2= new Greeter("Hava a fabulous day","I hope you drown in a pile of homework");
	System.out.println(g.sgreet("Sarah"));
	System.out.println(g2.hgreet("Sarah"));
    }
}
