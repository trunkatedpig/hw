import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {

    BankAccount bankAccount1=new BankAccount("David",100);
    BankAccount bankAccount2=new BankAccount("Victor",100);
	CoinGame coinGame = new CoinGame(bankAccount1, bankAccount2);



    coinGame.play(3);
        System.out.println(bankAccount1.getBalance());
        System.out.println(bankAccount2.getBalance());
    }
}
