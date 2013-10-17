public class For {

    public boolean isPrime(long n) {
        if (n <= 1 || n % 2 == 0) {
            return false;
        }
        for (long x = 3; x < (long) Math.sqrt(n); x += 2) {
            if (n % x == 0) {
                return false;
            }
        }
        return true;
    }

    public String reverse(String s) {
        String reversed = "";
        for (int x = s.length(); x > 0; x--) {
            reversed += s.substring(x-1,x);
        }
        return reversed;
    }
    
    /* This method calculates the amount of extra space need in front of a string
       so that the table aligns nicely when strings are concatenated */
    private String space(int digits, String e) {
        String extraSpace = " ";
        for (int x = 0; x < (digits - e.length()); x++) {
            extraSpace += " ";
        }
        return extraSpace;
    }
        
    public String table(int a, int b) {
        int maxDigits = String.valueOf(a*b).length();
        String table = space(maxDigits, "|") + "  |"; // To create top-left corner
        for (int i = 1; i <= a; i++) {
            table += space(maxDigits, String.valueOf(i)) + i; // To create top row numbers
        }
        table += "\n";
        for (int l = table.length(); l > 0; l--) {
            table += "-"; // To create top border
        }
        table += "\n";
        for (int i = 1; i <= b; i++) {
            table += space(maxDigits, String.valueOf(i)) + i + " |"; // To create left side border
            for (int j = 1; j <= a; j++) {
                String product = String.valueOf(i * j);
                table += space(maxDigits, product) + product;
            }
            table += "\n";
        }
        return table;
    }
}
