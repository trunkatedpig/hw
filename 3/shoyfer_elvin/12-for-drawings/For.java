public class For {

	public String repeatX(String x, int n) {
		String ans = "";
		for(int i = 0; i < n; i++) {
			ans = ans + x;
		}
		return ans;
	}

	public String diag(int n) {
		String ans = "";
		for(int i = 1; i <= n; i++) {
			int rightSpaces = n - i;
			int leftSpaces = n - rightSpaces - 1;
			String thisLine = repeatX(" ", leftSpaces) + "*" + repeatX(" ", rightSpaces) + "\n";
			ans = ans + thisLine;
		}
		return ans;
	}

	public String diagWord(String w) {
		String ans = "";
		int n = w.length();
		for(int i = 1; i <= n; i++) {
			String thisLetter = w.substring(0,1);
			w = w.substring(1);
			int rightSpaces = n - i;
			int leftSpaces = n - rightSpaces - 1;
			String thisLine = repeatX(" ", leftSpaces) + thisLetter + repeatX(" ", rightSpaces) + "\n";
			ans = ans + thisLine;
		}
		return ans;
	}

	public String fence(int h, int w) {
		String ans = "";

		int midParts = w - 2;
		String edgeLine = "+" + repeatX("-", midParts) + "+" + "\n";
		String midLine = "|" + repeatX(" ", midParts) + "|" + "\n";

		String mid = "";
		int midHeight = h - 2;
		for (int i = 0; i < midHeight; i++) {
			mid = mid + midLine;
		}

		ans = edgeLine + mid + edgeLine;
		return ans;
	}


}