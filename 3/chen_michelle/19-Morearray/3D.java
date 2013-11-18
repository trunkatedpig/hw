public class ArrayStuff {
    public double mean() {
	int sum = 0;
	int i = 0;
	int index = 0; //change to array's length
	while (i < index) {
	    sum = sum + nums[i];//find what the array is called
	    i ++;
	}
	int avg = sum / index;
	return avg;
    }
    
    public double stddev() {
	int sum = 0;
	int i = 0;
	int index = 0;
	while (i<index) {
	    sum = sum + (nums[i] * nums[i]);
	    i ++;
	}
	int result = sqrt (sum);
    }
}