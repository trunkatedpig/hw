import java.io.*;
import java.util.*;

public class Hero extends Character{
    public Hero(){
	maxHP=100;
	hP=maxHP;
	maxMP=100;
	mP=maxMP;
	maxAP=10;
	aP=maxAP;
	str=10;
	dex=10;
	intell=10;
	inventory= new ArrayList<Items>();
	name = "Sir Arthur";
	ability = new ArrayList<Abilities>();
	ability.add(new Abilities("Flee"));
	spells = new ArrayList<Spells>();
	armor = 0;
	level = 1;
	exp = 0;
    }
}
