public class For{
    public String Reverse(String s){
        int i;
        String ans = "";
        for (i = s.length()-1;i >= 0; i --){
            ans = ans + s.substring(i,i+1);
        }
        return ans;
    }

    public String table(int n, int m){
        int column;
        int row;
        String ans = "  ";
        for (column = 1; column <= n; column ++){
            ans = ans + column + " ";
        }
        for (row = 1;row <= m;row ++){
            ans = ans + "\n" + row + "|";
            for (column = 1;column <= n; column ++){
                ans = ans + (row * column) + " ";
            }
        }
        return ans;
    }
}
