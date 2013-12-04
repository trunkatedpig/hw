public class Driver{
    public static void main (String[] args){
	Arrays3 a;
	a = new Arrays3();
	int[] example = new int[5];
	example[0] = 1;
	example[1] = 6;
	example[2] = 13;
	example[3] = 24;
	example[4] = 8;
	
	System.out.println("Mean = " + a.mean(example));
	System.out.println("σ = "  + a.mean(example));
    }
}
