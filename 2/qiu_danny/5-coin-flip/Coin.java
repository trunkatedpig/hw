public class Coin {
    
    private String side;
    private int flips, heads;
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
        flips = heads = 0;
    }

    public void flip() {
        double x;
        x = Math.random();
        if (x < probability) {
            side = "Heads";
            flips++;
            heads++;
        } 
        else {
            side = "Tails";
            flips++;
        }
    }

    public String getSide() {
        return side;
    }

    public int getFlips() {
        return flips;
    }

    public int getHeads() {
        return heads;
    }

    public int getTails() {
        return flips - heads;
    }

    public boolean sameSide(Coin other) {
        return side == other.getSide();
    }
}
