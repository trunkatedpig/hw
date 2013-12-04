import java.util.*;


public class Driver {
    public static void main(String[] args) {
	WordSearch w = new WordSearch();
	System.out.println(w);

	w.addWordH (3, 14, "Hello");

w.addWordH (2, 17, "Why");

w.addWordH (3, 5, "Who");

w.addWordH (15, 13, "What");

w.addWordH (15, 15, "Potato"); //Shouldn't pop up

w.addWordH (10, 2, "Jack");

w.addWordH (10, 1, "Happy"); //Shouldn't pop up

w.addWordH (7, 3, "YO");

w.addWordH (5, 2, "Oi");

w.addWordH (14, 5, "Flamingo");

w.addWordH (19, 7, "Hola");

w.addWordH (19, 5, "Flarper"); //Shouldn't pop up

w.addWordH (14, 13, "Carp");

//System.out.println (w.addWordH (14,5,"Flarper") );
       
System.out.println(w);

    }

}
