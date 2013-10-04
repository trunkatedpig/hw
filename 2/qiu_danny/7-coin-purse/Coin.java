import java.util.*;

public class Coin {

    private String type;
    private double value;
    private String[] types = {"dollar", "half-dollar", "quarter", "dime", "nickel", "penny"};
    private double[] values = {1. , .5, .25, .1, .05, .01};
    
    Random random = new Random();

    private void randomCoin() {
        int n = random.nextInt(6);
        type = types[n];
        value = values[n];
    }

    public Coin() {
        randomCoin();
    }

    public Coin(String s) {
        s = s.toLowerCase();
        type = s;
        int i = 0; // For current index of string in the types array
        for (int x = 0; x < types.length; x++) {
            if (types[x].equals(s)) {
                i = x;
                break;
            }
            else {
                i = -1;
            }
        }
        if (i != -1) {
            type = types[i];
            value = values[i];
        }
        else {
            randomCoin();
        }
    }

    public Coin(String s, double n) {
        type = s;
        value = n;
    }

    public String getType() {
        return type;
    }

    public double getValue() {
        return value;
    }
}
