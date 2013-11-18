import java.io.*;
import java.util.*;

public class CoinPurse {
    private int amt;
    
    public void addCoins(Coin c){
	amt= amt+ c.getValue();}
    
    public void removeCoins (Coin c){
	amt= amt - c.getValue();

}

    public int getAmt(){
	return amt;

}







}
