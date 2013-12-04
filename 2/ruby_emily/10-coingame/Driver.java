import java.io.*;
import java.util.*;

public class Driver{
    public static void main(String[] args){
	CoinGame c=new CoinGame();
	c.makePot();
	c.play(4);
	System.out.println(c.getBalances());
    }
}
