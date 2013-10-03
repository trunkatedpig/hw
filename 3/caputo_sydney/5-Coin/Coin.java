import java.util.*;

public class Coin {
    public String face;
    public int flipCount;
    public int coinFair;


    public Coin(int f){
	resetCount();
	setFair(f);


}
    public void  setCount(int c){
	flipCount = c;


}

    public void resetCount(){
	setCount(0);


}
    public String coinFace(){
	return face;
	
}

    public void setFair(int f){
	coinFair=f;


}

}
