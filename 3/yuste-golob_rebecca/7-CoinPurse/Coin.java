public class Coin {
    //instance variables
    private int flips=0;
    private int heads=0;
    private int tails=0;
    private double fairness=0.5;
    private double value=0.25;
    private String name="Quarter";

    //get methods
    public int getFlips(){return flips;}
    public int getHeads(){return heads;}
    public int getTails(){return tails;}
    public double getFairness(){return fairness;}
    public double getValue(){return value;}
    public String getName(){return name;}

    //set methods
    public void reset(){
	flips = 0;
	heads = 0;
	tails = 0;
    }
    public void setFlips(int f){flips=f;}
    public void setHeads(int h){heads=h;}
    public void setTails(int t){tails=t;}
    public void setFairness(double f){fairness=f;}
    public void setValue(double v){value=v;}
    public void setName(String n){name=n;}

    //constructors
    public Coin(){}

    public Coin(String n, double v){
	setName(n);
	setValue(v);
    }
   
}
