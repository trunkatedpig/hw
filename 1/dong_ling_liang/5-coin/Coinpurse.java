import java.io.*;
import java.util.*;

public class coinpurse{

    private double money;
    
    public void addTo (Coin c) {
	money += c.getAmount;
    }
    
    public void removeFrom (Coin c) {
	money -= c.getAmount;
}