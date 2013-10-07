import java.io.*;
import java.util.*;

public class Driver {

    public static  void main(String[] args) {


    Coin LQ2, LQ3;
    CoinPurse MagicalPurse,RegularPurse;

	

    

	
		
	//____________________________________________________________________


	LQ2 = new Coin(25, "ThisShouldntMatter");
	LQ3 = new Coin(93, "Supercoin");
	
	MagicalPurse = new CoinPurse("Yes");
	RegularPurse = new CoinPurse("NOWNEOIDBNQOBOWINFOIE");
	
	MagicalPurse.addTo(LQ2, 293);
	
    }
}
