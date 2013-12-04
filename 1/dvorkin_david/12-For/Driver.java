import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {
	ForLoops s = new ForLoops();

	s.diag(4);

	System.out.println("========================");

	s.diagWord("Hello");

	System.out.println("========================");

	s.fence(5, 8);
    }
}
