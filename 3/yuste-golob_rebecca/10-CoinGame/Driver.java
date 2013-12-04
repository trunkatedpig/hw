import java.io.*;
import java.util.*;

public class Driver{
    public static void main(String[] args){
        BankAccount test1 = new BankAccount("Sally", 7);
	BankAccount test2 = new BankAccount("Bob", 11);
	CoinGame round1 = new CoinGame(test1, test2);
	round1.play(3);
    }
}
