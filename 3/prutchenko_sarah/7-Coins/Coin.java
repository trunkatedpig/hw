public class Coin{
    private int value;
    private String name;
    public Coin(int coinValue){
	value = coinValue;
	if (value == 25){
	    name = "quarter";
       	}
	if (value == 10){
	    name = "dime";
        }
	if (value == 5){
	    name = "nickel";
	}
	if (value == 1){
	    name = "penny";
	}
    }
    public int getValue(){
	return value;
    }
    public String getName(){
	return name;
    }
 }
