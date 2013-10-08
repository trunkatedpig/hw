public class Coin {
	private boolean Heads = true;
	private int HeadCount = 0;
	private int TailCount = 0;
	private int SuccessRate = 50;
	private double Value = 0.00;
	private String Name = "Nameless Coin";
	
	public Coin(String n, double v) {
		Name = n;
		Value = v;
	}
	
	public void ResetCounter(){
	HeadCount = 0;
	TailCount = 0;
	}
	public int getHeadCount() {
		return HeadCount;
	}
	public int getTailCount() {
		return TailCount;
	}
	
	public double getValue() {
		return Value;
	}

	/* public getFace(){
	String Face;
	if (Heads == true) {
	Face = "Heads";
	}
	if (Heads == false) {
	Face = "Tails";
	}
	return Face;
	}
	*/

}