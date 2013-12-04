import java.util.*;
import java.io.*;

public class Driver {
	public static void main(String[] args) {
		MoarFor mf = new MoarFor();
			System.out.println(mf.diag(5));
			System.out.println(mf.diagString("Hello"));
			System.out.println(mf.fence(5,8));
	}
}


