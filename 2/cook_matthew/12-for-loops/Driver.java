
import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {
	Diag n= new Diag();
	System.out.println(n.diag(4));
	System.out.println(n.diag(8));
	System.out.println(n.diag(6));
	System.out.println(n.diagWord("midgets"));
	System.out.println(n.fence(4,7));
	System.out.println(n.fence(5,8));
	System.out.println(n.fence(60,34));

    }
}