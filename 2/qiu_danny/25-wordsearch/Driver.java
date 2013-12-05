public class Driver {

    public static void main(String[] args) {
        Wordsearch w = new Wordsearch(9,11);
        System.out.println(w.addWord(2,3,"Hello"));
        System.out.println(w.addWordDown(2,3,"Hello"));
        System.out.println(w.addWordDiagonal(2,3,"Hello"));
        System.out.println(w.addWord(4,4,"BLAHWADWAD"));
        System.out.println(w.addWord(1231,123123,"Hehe"));
        System.out.println(w);
    }
}
