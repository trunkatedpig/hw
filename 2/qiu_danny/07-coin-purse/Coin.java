import java.util.*;

public class Coin {

    private String type;
    private double value;
    private static final String[] types = {"dollar", "half-dollar", "quarter", "dime", "nickel", "penny"};
    private static final double[] values = {1. , .5, .25, .1, .05, .01};
    
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
        int i = 0; // Used for current index when going through the types array
        for (int x = 0; x < types.length; x++) {
            if (types[x].equals(s)) {
                i = x; // When argument string is matched in array, position in array is stored for later
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

    public Coin(double v) {
        value = v;
        type = "mystery(" + v + ")";
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
