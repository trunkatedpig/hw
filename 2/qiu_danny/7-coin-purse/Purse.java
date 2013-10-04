public class Purse {
    
    private Coin[] contents = new Coin[1024];
    private int i = 0;

    public void addCoin(Coin c) {
        contents[i] = c;
        i++;
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
}
