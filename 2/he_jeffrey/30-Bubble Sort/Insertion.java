public class Insertion {
	public int[] rando;

	public Insertion(int[] nums) {
		this.rando = nums;
	}

	public int[] insertion() {
		int a = 0;
		int comparisons = 0;
		int tmp = 0;
		int j = 0;
		boolean doneInner = true;
		for (int i = 0; i < rando.length - 1; i++) {
			if (rando[i+1] < rando[i]) {
				tmp = rando[i+1];
				rando[i + 1] = rando[i];
				rando[i] = tmp;
				j = i;
				while(!doneInner) {
					if (j==0) {
						break;
					}
					if (rando[j-1] > rando[j]) {
						tmp = rando[j];
						rando[j] = rando[j-1];
						rando[j-1] = tmp;
						j--;
					}else{
						break;
					}
				}
			}
		}
		return rando;
	}

}