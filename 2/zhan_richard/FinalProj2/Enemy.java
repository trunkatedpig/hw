import java.io.*;
import java.util.*;
public class Enemy  extends Character{
    private Random r = new Random();
    //THIS IS MY MAKESHIFT DICTIONARY. ALL INDEXES MATCH.
    //MAPS CAN'T STORE INTS AND DOUBLES
    private String[] monsterNames = {
	"Centuar",
	"Cerberus",
	"Chimera",
	"Cyclops",
	"Demon",
	"Dragon",
	"Dust Bunny",
	"Fairy",
	"Faun",
	"Gargoyle",
	"Ghost",
	"Giant",
	"Medusa",
	"Minotaur",
	"Troll",
	"Vampire"};

    private int[][] monsterStats = {
	//{initStr,initDex,initIntell,level*Str,level*Dex,level*Intell}
	{16,10,4,3,2,1},
	{10,16,3,2,3,1},
	{15,15,15,2,2,2},
	{18,8,1,3,2,1},
	{11,13,12,3,2,2},
	{20,12,20,5,5,5},
	{7,18,10,1,3,2},
	{8,11,25,1,2,4},
	{9,14,16,1,2,2},
	{10,13,5,3,2,1},
	{4,14,24,1,2,3},
	{30,10,0,3,2,0},
	{9,12,12,1,3,3},
	{14,11,0,2,3,0},
	{25,8,0,2,4,0},
	{10,10,10,2,3,2}};
    private double[][] monsterStats2 = {
	//{accuracy,crit,armor,evasion}
	{.85,.05,.05,.02},
	{.9,.05,0,.04},
	{.8,.01,.01,.01},
	{.8,0,.05,0},
	{.8,0,.05,.03},
	{.85,.05,.1,0},
	{.8,.02,0,.20},
	{.8,0,0,.20},
	{1,0,0,.15},
	{.7,0,.4,.05},
	{.75,0,0,.66},
	{.5,0,0,0},
	{1,.1,.05,.1},
	{.65,0,0,.1},
	{.95,.05,.05,.08}};

    public Enemy(String n, Hero h){
	level=h.getLevel();
	int index = Arrays.asList(monsterNames).indexOf(n);
	str=monsterStats[index][0]+((level-1)*monsterStats[index][3]);
	dex=monsterStats[index][1]+((level-1)*monsterStats[index][4]);
	intell=monsterStats[index][2]+((level-1)*monsterStats[index][5]);
	maxHP=str*4;
	hP=maxHP;
	maxMP=intell*2;
	mP=maxMP;
	maxAP=10;
	aP=maxAP;
	minDamage=dex/4;
	maxDamage=dex/2;
	inventory= new ArrayList<Items>();
	name = n;
	ability = new ArrayList<Abilities>();
	spells = new ArrayList<Spells>();
	accuracy = monsterStats2[index][0];
	crit = monsterStats2[index][1];
	armor = monsterStats2[index][2];
	evasion = monsterStats2[index][3];
	exp = 10+(5*(level-1));
    }
}
