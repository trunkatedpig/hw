import java.util.*;

public class ArraysTime {

    private int count, trials;
    private long start, end, sum;
    protected ArrayList<Integer> a = new ArrayList<Integer>();

    Random r = new Random();

    public ArraysTime(int c, int t) {
        count = c;
        trials = t;
    }

    public ArraysTime(int c, int t, ArrayList<Integer> a) {
        count = c;
        trials = t;
        this.a = a;
    }

    protected void addList() {
        for (int i=0; i<count; i++) {
            a.add(5);
        }
    }

    public long avgAddList() {
        sum = 0;
        for (int t=0; t<trials; t++) {
            a = new ArrayList<Integer>();
            start = System.currentTimeMillis();
            addList();
            end = System.currentTimeMillis();
            sum += (end - start);
        }
        long avg = sum / trials;
        return avg;
    }

    protected void addBeginList() {
        for (int i=0; i<count; i++) {
            a.add(0, 5);
        }
    }

    public long avgAddBeginList() {
        sum = 0;
        for (int t=0; t<trials; t++) {
            a = new ArrayList<Integer>();
            start = System.currentTimeMillis();
            addBeginList();
            end = System.currentTimeMillis();
            sum += (end - start);
        }
        long avg = sum / trials;
        return avg;
    }

    protected void removeList() {
        int size = a.size() - 1;
        for (int i=size; i>=0; i--) {
            a.remove(i);
        }
    }

    public long avgRemoveList() {
        sum = 0;
        for (int t=0; t<trials; t++) {
            a = new ArrayList<Integer>();
            addList();
            start = System.currentTimeMillis();
            removeList();
            end = System.currentTimeMillis();
            sum += (end - start);
        }
        long avg = sum / trials;
        return avg;
    }

    protected void removeBeginList() {
        int size = a.size();
        for (int i=0; i<size; i++) {
            a.remove(0);
        }
    }

    public long avgRemoveBeginList() {
        sum = 0;
        for (int t=0; t<trials; t++) {
            a = new ArrayList<Integer>();
            addList();
            start = System.currentTimeMillis();
            removeBeginList();
            end = System.currentTimeMillis();
            sum += (end - start);
        }
        long avg = sum / trials;
        return avg;
    }

    protected void reverse() {
        ArrayList<Integer> tmp = new ArrayList<Integer>();
        int size = a.size()-1;
        for (int i=size; i>=0; i--) {
            tmp.add(a.get(i));
        }
        a = tmp;
    }

    public long avgReverse() {
        sum = 0;
        for (int t=0; t<trials; t++) {
            a = new ArrayList<Integer>();
            addList();
            start = System.currentTimeMillis();
            reverse();
            end = System.currentTimeMillis();
            sum += (end - start);
        }
        long avg = sum / trials;
        return avg;
    }
}
