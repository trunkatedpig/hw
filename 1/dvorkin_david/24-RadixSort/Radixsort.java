public class Radixsort{
    public int[] Radixsort(){
        for (int n=0;n<numDigit;n++){
            for (int i=0;i<intList.length;i++){
                int digit = 0;
                digit = (intList[i]/(int)Math.pow(10,n))%10;
                buckets[digit].add(intList[i]);
                
            }
            int intCounter = 0;
            for (int i=0;i<buckets.length;i++){
                for (int j=0;j<buckets[i].size();j++){
                    intList[intCounter] = (Integer)buckets[i].get(j);
                    intCounter++;
                }
            }
            
            for (int i=0;i<10;i++){
                buckets[i] = new ArrayList();
            }
        }
        return intList;
    }
