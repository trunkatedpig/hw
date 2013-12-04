public class For {
    
    public int GCD(int a, int b) {
        for (int x = Math.min(a, b); x > 1; x--) {
            if (a%x == 0 && b%x == 0)
                return x;
        }
        return 1;
    }

    public String Reverse(String s) {
        String ans = "";

        for (int i=s.length()-1; i>=0; i--) {
            ans = ans + s.substring(i, i+1);
        }
        return ans;
    }

    public String table(int x, int y) {
        String t = "";
        String spacing;
        int total = Integer.toString(x*y).length();
        int part;

        for (int j=1; j<=x; j++) {
            for (int i=1; i<=y; i++) {
                part = Integer.toString(i*j).length();
                spacing = createSpacing(total, part);
                t = t + i*j + spacing;
            }
            t = t + "\n";
        }

        return t;
    }

    private String createSpacing(int total, int part) {
        String spacing = "";

        for (int i=0; i<=(total - part); i++)
            spacing = spacing + " "; //Determines spacing between numbers
                                     //Based on higher-digit number
        return spacing;
    }
}
