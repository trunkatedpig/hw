public class Coin {

    private String side;
    
    public void flip() {
        if (Math.random() < .5) {
            side = "Heads";
        }
        else {
            side = "Tails";
        }
    }

    public String getSide() {
        return side;
    }
}
