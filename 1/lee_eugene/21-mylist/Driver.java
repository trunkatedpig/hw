public class Driver{
    public static void main(String[] args){
        ArrayStuff a = new ArrayStuff(5);
        System.out.println(a);
        a.insert(2,12345);
        System.out.println(a);
        System.out.println(a.remove(0));
        System.out.println(a); 
    }
}
