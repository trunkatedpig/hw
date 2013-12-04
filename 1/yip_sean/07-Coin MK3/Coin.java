public class Coin {
    private String name = "No name";
    private String face = "Unflipped";
    private int flips = 0;
    private int heads = 0;
    private double probability = 0.5;
    private int value = 0;

    public Coin() {}

    public Coin(String name) {this.name = name;}

    public Coin(double probability) {this.probability = probability;}

    public Coin(int value) {this.value = value;}

    public Coin(String name, double probability) {
	this.name = name;
	this.probability = probability;
    }

    public Coin(String name, int value) {
	this.name = name;
	this.value = value;
    }

    public Coin(double probability, int value) {
	this.probability = probability;
	this.value = value;
    }

    public Coin(String name, double probability, int value) {
	this.name = name;
	this.probability = probability;
	this.value = value;
    }

//------------------------------------------------------------------------------

    public void flip() {
	if (Math.random() < probability) {
	    face = "Heads";
	    heads += 1;
	}
	else {face = "Tails";}
    }

    public void resetFlips() {flips = heads = 0;}

    public String getName() {return name;}

    public String getFace() {return face;}

    public int getFlips() {return flips;}

    public int getHeads() {return heads;}

    public int getTails() {return flips - heads;}

    public double getProbability() {return probability;}

    public int getValue() {return value;}
}
