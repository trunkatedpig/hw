import java.io.*;
import java.util.*;

public class Hero extends Character{
   
    public Weapons EquipW;
    public Armor EquipA;
    public Items ItemI;
    public ArrayList<Equips> Equipment= new ArrayList<Equips>();
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
	gold = 10000;
	EquipW = new Weapons("Wooden Sword");
	Equipment.add(EquipW);
	EquipA = new Armor("Leather Vest");
	Equipment.add(EquipA);
    }

    public void toEquipW(String i){
	EquipW  = new Weapons("i");
	Equipment.add(EquipW);
       
	
    }
    public void toEquipA(String i){
	EquipA = new Armor("i");
	Equipment.add(EquipA);
    }
    
    public void toItem(String i){
	ItemI = new Items("i");
	inventory.add(ItemI);
    }
}
