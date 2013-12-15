public class Driver {

    public static void main(String[] args) {
        Wordsearch w = new Wordsearch(11,11);

        // Coodinates are all in (y,x)

// Hello +
        System.out.println(w.addWordHorizontal(5,1,"Hello", false));
        System.out.println(w.addWordHorizontal(5,9,"Hello", true));
        System.out.println(w.addWordVertical(1,5,"Hello", false));
        System.out.println(w.addWordVertical(9,5,"Hello", true));

        System.out.println(w);
        w = new Wordsearch(11,11);

// Hello X
/*
        System.out.println(w.addWordDiagonal(5,5,"Hello", "NW", false));
        System.out.println(w.addWordDiagonal(5,5,"Hello", "NW", true));
        System.out.println(w.addWordDiagonal(5,5,"Hello", "ne", false));
        System.out.println(w.addWordDiagonal(5,5,"Hello", "ne", true));
*/
        System.out.println(w.addWordDiagonal(5,5,"Hello", "sw", false));
        System.out.println(w.addWordDiagonal(5,5,"Hello", "sw", true));
        System.out.println(w.addWordDiagonal(5,5,"Hello", "SE", false));
        System.out.println(w.addWordDiagonal(5,5,"Hello", "SE", true));

        System.out.println(w);
        w = new Wordsearch(11,11);

// Borders
        System.out.println(w.addWordHorizontal(0,0,"----Top----", false));
        System.out.println(w.addWordHorizontal(1,10,"----Top----", true));
        System.out.println(w.addWordHorizontal(9,10,"--Bottom---", true));
        System.out.println(w.addWordHorizontal(10,0,"--Bottom---", false));
        System.out.println(w.addWordVertical(0,0,"|||Left||||", false));
        System.out.println(w.addWordVertical(10,1,"|||Left||||", true));
        System.out.println(w.addWordVertical(10,9,"|||Right|||", true));
        System.out.println(w.addWordVertical(0,10,"|||Right|||", false));

        System.out.println(w);
        w.fillRand();
        System.out.println(w);
    }
}
