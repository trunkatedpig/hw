import java.io.*;
import java.util.*;
public class Spells {
    private String spellname;
    private String[] smethod = {"v.setHP(20)","h.heal(h.getIntell())","h.setStr(10)","v.setHP(h.getIntell()*3)","h.setCritStat(.05)","h.heal(h.getIntell() * 2)","v.setHP(h.getIntell()*4)","poision?myniggacan'tfight","h.fullheal()","h.setHP(10000000000)" };
    private String[] cmethod = {"h.setMP(4)","h.setMP(10)","h.setMP(8)","h.setMP(15)","h.setMP(19)","h.setMP(24)","h.setMP(30)","h.setMP(35)","h.setMP(77)","h.setMP(100)"};
    private String[] s2method= {"", "","","","","","","","",""};
    public Spells(String i) {
	spellname= i;
	
    }

}
