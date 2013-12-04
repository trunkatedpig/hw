import java.io.*;
import java.util.*;

public class Coinpurse{
    private int amount;
    public Coinpurse(int a){
	amount = a;
    }

    public void addAmt(int a){
	amount = amount + a;
    }
    public void removeAmt(int a){
	amount = amount - a;
    }
    public int getAmount(){
	return amount;
    }
}
