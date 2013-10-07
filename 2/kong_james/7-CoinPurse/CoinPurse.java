import java.io.*;
import java.util.*;

public class CoinPurse {
    private double amt;

    public void addTo(Coin c){
	amt = amt + (c.getValue());
    }

    public void removeFrom(Coin c){
	amt = amt - (c.getValue());
    }
    
    public double getAmt(){
	return amt;
    }
}
