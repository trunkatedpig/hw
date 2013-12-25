import java.io.*;
import java.util.*;

public class Enemy extends Character{
    public Enemy(Hero h){
	maxHP=40;
	hP=maxHP;
	maxMP=20;
	mP=maxMP;
	maxAP=10;
	aP=maxAP;
	str=8;
	dex=8;
	intell=8;
	inventory= new ArrayList<Items>();
	name = "Monster";
	ability = new ArrayList<Abilities>();
	spells = new ArrayList<Spells>();
	armor = 0;
	exp = 10;
    }
}

