import java.util.*;
import java.io.*;

public class Sort{

    int[] iList = new int[5];
    int[] testList = new int[10];
    Random rand = new Random();

    public Sort(){
        for (int i=0;i<10;i++){
            testList[i] = rand.nextInt();
        }
    }

    public int[] bSort(){
        for (int i=0;i<5;i++){
            iList[i] = rand.nextInt(10);
        }
        for (int i=0;i<iList.length;i++){
            for (int j=0;j<iList.length-1;j++){
                if (iList[j] > iList[j+1]){
                    int tmp = iList[j+1];
                    iList[j+1] = iList[j];
                    iList[j] = tmp;
                }
            }
        }
        return iList;
    }

    public int[] insertSort(){
        int swapIndex = 0;
        for (int i=0;i<testList.length-2;i++){
            swapIndex = i;
            while (testList[swapIndex+1]<testList[swapIndex] && swapIndex >= 0){
                int temp = testList[swapIndex+1];
                testList[swapIndex+1] = testList[swapIndex];
                testList[swapIndex] = temp;
                swapIndex--;
            }
        }
        return testList;
    }

    public int[] selectSort(){
        int min = testList[0];
        int minIndex = 0;
        for (int j=0;j<testList.length-1;j++){
            for (int i=0;i<testList.length;i++){
                if (int[i] < min){
                    min = int[i];
                    minIndex = i;
                }
            }
            tmp = testList[minIndex];
            testList[minIndex] = int[j];
            int[j] = tmp;
        }
        return testList[];
    }

    public static void main(String[] args){
        Sort s = new Sort();
        System.out.println(Arrays.toString(s.bSort()));
        System.out.println(Arrays.toString(s.selectSort()));
    }
}
