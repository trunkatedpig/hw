
public class Driver {
	public static void main(String[] args){
		ArrayStuff stuff = new ArrayStuff();
		int[] result = stuff.Revfill(5);
		int[] result2 = stuff.makeRandom(5,6,10);
		
		//stuff.printArray(result);
		//stuff.printArray(result2);
		System.out.print("[");
		for(int i = 0;i<result.length;i++){
			System.out.print(result[i]);
			if(i<(result.length) - 1)
				System.out.print(",");
		}
		System.out.print("]");
		System.out.println("");
		
		System.out.print("[");
		for(int i = 0;i<result2.length;i++){
			System.out.print(result2[i]);
			if(i<(result2.length) - 1)
				System.out.print(",");
		}
		System.out.print("]");
		System.out.println("");
	}
}
