import java.io.*;
import java.util.*;

public class CoinPurse {

	private double amt;

	public void addTo (Coin coinName) {
		amt += coinName.getValue();
	}

	public void removeFrom (Coin coinName) {
		amt -= coinName.getValue();
	}
	public double total(){
		return amt;
	}




}