public class For {

    public String diag(int n) {
        String diag = "";
        for (int x = 0; x < n; x++) {
            for (int y = 0; y < x; y++) {
                diag += " ";
            }
            diag += "*\n";
        }
        return diag;
    }

    public String diagWord(String w) {
        String diag = "";
        for (int x = 0; x < w.length(); x++) {
            for (int y = 0; y < x; y++) {
                diag += " ";
            }
            diag += w.substring(x, x+1) + "\n";
        }
        return diag;
    }

    public String fence(int h, int w) {
        if (h <= 2 || w <= 2) {
            return "Your fence dimensions are out of range!";
        }
        else {
            String fence = "";
            for (int y = 1; y <= h; y++) {
                if (y == 1 || y == h) {
                    fence += "+";
                    for (int x = 2; x < h; x++) {
                        fence += "-";
                    }
                    fence += "+\n";
                }
                else {
                    fence += "|";
                    for (int x = 2; x < h; x++) {
                        fence += " ";
                    }
                    fence += "|\n";
                }
            }
            return fence;
        }
    }
}
