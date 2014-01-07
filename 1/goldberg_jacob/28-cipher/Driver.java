import java.util.*;
import java.io.*;

public class Driver {
    public static void main(String[] args) {
	cipher x = new cipher();
	System.out.println(x.encode("he33llo",3));
	System.out.println(x.encode("â€œhelloâ",3));
    }
}
