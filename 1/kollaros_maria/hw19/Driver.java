public class Driver {
    public static void main(String[] args) {
        ArrayStuff as = new ArrayStuff(10,10);
        System.out.println(as);
        System.out.println(as.findMaxIndex());
	System.out.println(as.freq(5));
        as.mode();
	System.out.println(as.mean());
	System.out.println(as.stddev());
    }
            
}
            
