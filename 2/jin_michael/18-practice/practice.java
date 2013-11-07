public class practice{
    public int[] revfizz(int n) {
	int[] result = new int[n];
	for (int i = 0; i < n; i++) {
	    result[i] = n - 1 - i;
	}
	return result;
    }

    public int[] makerandom(int n, int min, int max){
	Random r = new Random();
	int[] answer = new int[n];
	for (int i=0;i<n;i++){
	    answer[i]="randomnumber";
	}


    }


}