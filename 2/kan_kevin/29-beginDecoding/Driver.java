import java.util.*;
import java.io.*;

public class Driver{
    public static void main(String args[]){
	frequency f = new frequency();
	f.buildCF("WilliamShakespeare.txt");
	f.getCF();
    }
}
