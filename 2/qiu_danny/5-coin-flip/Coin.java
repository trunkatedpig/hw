public class Coin {
    
    private boolean side;
    private int flips, heads, tails;
    private double probability;

    public Coin() {
        reset();
        probability = .5;
    }

    public Coin(double n) {
        reset();
        probability = n;
    }

    public void reset() {
        flips = heads = tails = 0;
    }

    public void flip() {
        double x;
        x = Math.random();
        if (x < probability) {
            side = true;
            flips++;
            heads++;
        } 
        else {
            side = false;
            flips++;
            tails++;
        }
    }

    public String getFace() {
        if (side) {
            return "Heads";
        }
        else {
            return "Tails";
        }
    }

    public int getFlips() {
        return flips;
    }

    public int getHeads() {
        return heads;
    }

    public int getTails() {
        return tails;
    }
}
