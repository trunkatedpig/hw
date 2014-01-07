import java.io.*;
import java.util.*;

public class Driver {

    public static void main(String[] args) {
	CorpusFreqs cp = new CorpusFreqs();
	System.out.println(Arrays.toString(cp.Freqs("Shakespeare.txt")));
    }

}