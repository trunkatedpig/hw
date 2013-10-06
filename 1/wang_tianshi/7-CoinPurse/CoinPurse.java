import java.io.*;
import java.util.*;

public class CoinPurse {

    private double purseAmount;

    public CoinPurse(){
	purseAmount=0;
    }

    public void addTo(Coin c){
	purseAmount = purseAmount + c.getValue();
    }
    
    public void removeFrom (Coin c){
	purseAmount = purseAmount - c.getValue();
    }
    
    public double totalPurse(){
	return purseAmount;
    }
}
