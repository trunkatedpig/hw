import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {
        Rot13 r = new Rot13();

	System.out.println(r.rot("Hello!", 3));
	}
}
