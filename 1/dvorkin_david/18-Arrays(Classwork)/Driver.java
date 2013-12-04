public class Driver{
    public static void main(String args[]) {
	Arrays r = new Arrays();

	int [] result=r.Revfill(10);

        for(int i=0;i<10;i++)
        System.out.println(result[i]);

        System.out.println("==========");
        int [] result2=r.MakeRandom(10,0,25);

        for(int i=0;i<10;i++)
            System.out.println(result2[i]);
    }
}
