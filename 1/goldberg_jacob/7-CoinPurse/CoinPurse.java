import java.io.*;
import java.util.*;

public class CoinPurse {
	private double ammount;

	public CoinPurse(){
		setAmmount(.35);
	}

	public CoinPurse(double a){
		setAmmount(a);
	}

	public void setAmmount(double v){
		ammount = v;
	}

	public void addTo(Coin c) {
		setAmmount(ammount + c.getAmmount());
	}

	public void removeTo(Coin d) {
		setAmmount(ammount - d.getAmmount());
	}

	public void addTo() {
		setAmmount(ammount + .1);
	}

	public void removeTo() {
		setAmmount(ammount - .1);
	}

	public double getAmmount(){
		return ammount;
	}
}
