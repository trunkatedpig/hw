import java.io.*;
import java.util.*;
public class Hero  extends Character{
    private Weapons EquipW;
    private Armor EquipA;
    private Items ItemI;

    public Hero(){

	EquipW = new Weapons("Wooden Sword");
	Equipment.add(EquipW);
	
	EquipA = new Armor("Tunic");
	Equipment.add(EquipA);

	updateStats();
	hP=maxHP;

	mP=maxMP;

	aP=maxAP;

	inventory= new ArrayList<Items>();
	name = "Sir Arthur";
	ability = new ArrayList<Abilities>();
	ability.add(new Abilities("Flee"));
	spells = new ArrayList<Spells>();
	level = 1;
	exp = 0;
	gold = 1000;
    }
    public void toBuyW(String i){
	toEquipW(i);
	Equipment.add(EquipW);
    }

    public void toEquipW(String i){
	EquipW  = new Weapons(i);
	updateStats();	
    }
    public void toBuyA(String i){
	toEquipA(i);
	Equipment.add(EquipA);
    }
    public void toEquipA(String i){
	EquipA = new Armor(i);
	updateStats();
    }
    public void toItem(String i){
	ItemI = new Items(i);
	inventory.add(ItemI);
    }
    public String getEW(){
	return EquipW.getEquipName();
    }
    public String getEA(){
	return EquipA.getEquipName();
    }
    public void updateStats(){
	maxHP=60+(str*4);
	maxMP=10+(intell*2);
	maxAP=10+((level-1)*2);
	minDamage=(dex/4)+EquipW.getMinDamage();
	maxDamage=(dex/2)+EquipW.getMaxDamage();
	crit=EquipW.getCrit();
	accuracy=EquipW.getAccuracy();
	armor=EquipA.getArmor();
    }



}
