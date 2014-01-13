import java.io.*;
import java.util.*;

public class pig extends project{
    private int pfatness, phunger, fertility;
    
    public pig(){

	pfatness = 5;
	phunger = 0;
	fertility = 0;

    }

    public int getfatness(){
	return pfatness;
    }

    public int gethunger(){
	return phunger;
    }

    public void addfatness(int f){
	pfatness = pfatness + f;
    }

    public void addhunger(int h){
	phunger = phunger + h;
    }

}
