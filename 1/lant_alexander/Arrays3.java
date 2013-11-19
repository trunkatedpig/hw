public class Arrays3{
    
    public double mean(double[] array){
    double sum = 0;
    for (int i = 0; i < array.length; i ++){
        sum = sum + array[i];            
        } 
        return sum;
    }       
            
    public double stddev(double[] array){
        double[] temp = new double[array.length];
        double mean = mean(array);
        for (int i = 0; i < array.length; i ++)
            temp[i] = ((array[i] - mean) ^ 2);   
        int result = sqrt(mean(temp));
        return result;
    }
        
    }
