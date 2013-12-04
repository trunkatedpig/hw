import java.io.*;
import java.util.*;

public class CoinPurse{
    private int amount;

    public CoinPurse(){
	amount = 0;
    }

    public void addTo(Coin c){
	amount = amount + c.getValue();
    }
    public void removeFrom(Coin c){
	amount = amount - c.getValue();
   }

}