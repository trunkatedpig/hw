import java.util.*;
import java.io.*;

public class Driver {
    public static void main(String[] args) {
	CaesarCipher c = new CaesarCipher();
	System.out.println(c.encode("he33llo",3));
    }
}
