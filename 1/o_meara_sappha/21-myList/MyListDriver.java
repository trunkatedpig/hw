import java.io.*;
import java.util.*;

public class MyListDriver {
    public static void main(String[] args) {
	MyList L = new MyList();

	for (int i = 0; i < 10; i ++) {
            L.add(i);
        }
        System.out.println(L);
	L.insert(3, 3);
	System.out.println(L);
    }
}
