import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {
	 
	 coinGame c = new coinGame();
	 c.putMoney();
	 System.out.println(c.getBankAccount1());
	 System.out.println(c.getBankAccount2());
	 System.out.println();
	 c.play(5);
     }
}
