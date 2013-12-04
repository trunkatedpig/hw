public class Driver {
    public static void main(String[] args) {
        WordSearch w = new WordSearch();

        boolean b = w.addWordH(4,7,"Monday");
        System.out.println(b + "\n" + w);

        boolean b1 = w.addWordH(17,2,"Tuesday");
        System.out.println(b1 + "\n" + w);

        boolean b2 = w.addWordH(20,20,"Thursday");
        System.out.println(b2 + "\n" + w);

        boolean b3 = w.addWordH(0,0,"Wednesday");
        System.out.println(b3 + "\n" + w);

        boolean b4 = w.addWordH(3,4,"Friday");
        System.out.println(b4 + "\n" + w);

        boolean b5 = w.addWordH(8,13,"Weekend");
        System.out.println(b5 + "\n" + w);
       