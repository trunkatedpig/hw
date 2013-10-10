public class Loops{
    
    public int fact(int n){
        if (n == 1)
            return n;
        else
            return n * fact(n - 1);
    }

    public int fact2(int n){
        int counter = 1;
        int ans = 1;
        while (counter <= n){
            ans = ans * counter;
            counter++;
        }
        return ans;
    }
}
