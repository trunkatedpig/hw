public class SortTests{
    public static void main (String[] args){
	
	//Args stuff:
	int length = new Integer(args[0]);
	int range = new Integer(args[1]);

	//Init stuff;
	long lasttime = 0;
        Random R = new Random();
	int[] Array = new int[length];
	
	for(int i = 0; i < length; i++){
 	    Array[i]= R.nextInt(range);
	}

	lasttime = System.currentTimeMillis();
	Sort.sort(Array);
	System.out.println("My sort method takes " + (System.currentTimeMillis() - lasttime) + " to complete.");
	lasttime = (System.currentTimeMillis() - lasttime);
	Arrays.sort(Array);
        System.out.println("The built-in sort method takes " + (System.currentTimeMillis() - lasttime + " to complete.")
	
    }

}