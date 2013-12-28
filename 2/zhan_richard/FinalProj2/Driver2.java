import java.io.*;
import java.util.*;
public class Driver2{
    public static void main(String[] args){
	Hero h = new Hero();
	h.toBuyW("Sabre");
	h.toBuyA("Chainmail");
	System.out.println(h.getCharacterMinDamage());
	System.out.println(h.getCharacterMaxDamage());
	System.out.println(h.getArmorStat());
	System.out.println(h.getCritStat());
	System.out.println(h.getEvasionStat());
	
	System.out.println(h.getAccuracyStat());
    }
}
