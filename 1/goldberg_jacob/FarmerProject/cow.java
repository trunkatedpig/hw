import java.io.*;
import java.util.*;

public class cow extends project{
    private int cfatness, cmilk, chunger, fertility;
    
    public cow(){

	cfatness = 10;
	cmilk = 0;
	chunger = 0;
	fertility = 0;

    }

    public int getfatness(){
	return cfatness;
    }

    public int getpmilk(){
	return cmilk;
    }

    public int gethunger(){
	return chunger;
    }

    public void milked(){
	cmilk = 0;
    }

    public void addfatness(int f){
	cfatness = cfatness + f;
    }

    public void addmilk(int m){
	cmilk = cmilk + m;
    }

    public void addhunger(int h){
	chunger = chunger + h;
    }

}
