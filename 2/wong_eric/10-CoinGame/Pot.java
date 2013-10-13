import java.io.*;
import java.util.*;

public class Pot {

    private double amount;
    private Random r;

    public Pot() {
	r = new Random();
	amount = ((double)(r.nextInt(100)));
    }
}