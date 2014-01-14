public class Driver{
    public static void main(String[] args){
        
        ArrayPractice a = new ArrayPractice();

       /* int[] test = a.RevFill(5);
        for (int i=0;i<test.length;i++)
            System.out.println(test[i]);
        */
        int[] test2 = a.MakeRandom(10,3,7);
        for (int i=0;i<test2.length;i++)
            System.out.println(test2[i]);
    }
}
