public class Purse {
    
    private Coin[] contents = new Coin[1024];
    private int i = 0;

    public void addCoin(Coin add) {
        if (i < 1024) {
            contents[i] = add;
            i++;
        }
        else {
            System.out.println("Sorry! There is no more space in your purse.");
        }
    }

    public void removeCoin(Coin remove) {
        for (int x = 0; x < contents.length; x++) {
            Coin c = contents[x];
            if (c == remove) {
                contents[x] = null;
                return;
            }
        }
        System.out.println("The coin you want to remove does not exist in the purse!");
    }

    public Coin[] getCoins() {
        return contents;
    }

    public String getCoinTypes() {
        String s = "";
        for (int x = 0; x < contents.length; x++) {
            Coin c = contents[x];
            if (c != null) {
                s += c.getType() + ", ";
            }
        }
        return s;
    }

    public String getCoinValues() {
        String s = "";
        for (int x = 0; x < contents.length; x++) {
            Coin c = contents[x];
            if (c != null) {
                s += c.getValue() + ", ";
            }
        }
        return s;
    }
    
    public double getTotalValue() {
        double n = 0;
        for (int x = 0; x < contents.length; x++) {
            Coin c = contents[x];
            if (c != null) {
                n += c.getValue();
            }
        }
        return n;
    }
}
