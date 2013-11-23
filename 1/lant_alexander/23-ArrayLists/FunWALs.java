public class FunWALs{
 
	ArrayList<Integer> A = new ArrayList<Integer>(); 
	
    public void add(){
	A.add(0);
	System.out.println(System.currentTimeMillis());	    
    } 
    public void endAdd(){
	A.add(0, 10);
	System.out.println(System.currentTimeMillis());
    }

} 