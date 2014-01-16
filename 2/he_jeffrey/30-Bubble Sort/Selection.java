public class Selection {
	public int[] rando;

	public Selection(int[] nums) {
		this.rando = nums;
	}
	public int[] selection() {
		int a = 0;
		int comparisons = 0;
		for (int i = 0; i < rando.length - 1; i++) {
			int smallest = rando[i];
			int smallestIndex = i;
			for (int j = i + 1; j < rando.length; j++) {
				if (rando[j] < smallest) {
					smallest = rando[j];
					smallestIndex = j;
					a += 2;
					comparisons++;
				}
			}
			rando[smallestIndex] = rando[i];
			rando[i] = smallest;
			a += 2;
		}
		System.out.println("Number of assignments = "+a);
		System.out.println("Number of comparisons = "+comparisons);
		return rando;
	}
}