public class Driver {

    public static void main(String[] args) {
        Wordsearch w;
        if (args.length == 2) {
            int rows = Integer.parseInt(args[0]);
            int columns = Integer.parseInt(args[1]);
            w = new Wordsearch(rows, columns);
        }
        else {
            w = new Wordsearch(44,88);
        }

        // Coodinates are all in (y,x)

// Hello +
/*
        System.out.println(w.addWordH(5,1,"Hello"));
        System.out.println(w.addWordHR(5,9,"Hello"));
        System.out.println(w.addWordV(1,5,"Hello"));
        System.out.println(w.addWordVR(9,5,"Hello"));
        System.out.println(w);
        w = new Wordsearch(11,11);
*/

// Hello X
/*
        System.out.println(w.addWordNW(5,5,"Hello"));
        System.out.println(w.addWordNWR(5,5,"Hello"));
        System.out.println(w.addWordNE(5,5,"Hello"));
        System.out.println(w.addWordNER(5,5,"Hello"));
        System.out.println(w.addWordSW(5,5,"Hello"));
        System.out.println(w.addWordSWR(5,5,"Hello"));
        System.out.println(w.addWordSE(5,5,"Hello"));
        System.out.println(w.addWordSER(5,5,"Hello"));
        System.out.println(w);
        w = new Wordsearch(11,11);
*/

// Borders
/*
        System.out.println(w.addWordH(0,0,"----Top----"));
        System.out.println(w.addWordHR(1,10,"----Top----"));
        System.out.println(w.addWordHR(9,10,"--Bottom---"));
        System.out.println(w.addWordH(10,0,"--Bottom---"));
        System.out.println(w.addWordV(0,0,"|||Left||||"));
        System.out.println(w.addWordVR(10,1,"|||Left||||"));
        System.out.println(w.addWordVR(10,9,"|||Right|||"));
        System.out.println(w.addWordV(0,10,"|||Right|||"));
*/

        w.importWordList("words");
        w.addWordList();
        System.out.println(w);
        w.fillRand();
        System.out.println(w);
    }
}
