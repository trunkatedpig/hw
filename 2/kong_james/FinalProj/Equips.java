public class Equips {
    public String Ename;
    public String[] description;
    //The Methods
    public Equips(){
    	
    }
    public Equips(String i){
	Ename = i;
    }
    public String getEquipName(){
	return Ename;
    }
     public String[] getDescription(){
    	return description;
    }
}
