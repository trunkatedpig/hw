public class Coin {
	private boolean Heads = false;
	private int HeadCount = 0;
	private int TailCount = 0;
	private int SuccessRate = 50;
	
	public void ResetCounter(){
	HeadCount = 0;
	TailCount = 0;
	}
	
	public getFace(){
	String Face;
	if (Heads == true) {
	Face = "Heads";
	}
	if (Heads == false) {
	Face = "Tails";
	}
	return Face;
	}
}
	