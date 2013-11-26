import java.util.*;

public class codingbat 
{
	public static void main(String[] args)
	{
		System.out.println(revFill(5));
		System.out.println(makeRandom(5,4,8));
		System.out.println(sum13(new int[]{1,1,2,3,13,5,16}));
		System.out.println(modThree(new int[]{1,4,3,7,5,0}));
			
	}

	static int[] revFill(int n)
	{
		int[] temp = new int[n];
		for(int i = n;i > 0; i--)
		{
			temp[n - i] = i;
		}
		return temp;
	}

	static int[] makeRandom(int n, int min, int max)
	{
		Random r = new Random();
		int[] temp = new int[n];
		for(int i = 0; i < n; i++)
		{
			temp[i] = r.nextInt(max - min + 1) + min;
		}
		return temp;
	}	

	static int sum13(int[] nums)
	{
		boolean flag = false;
		int sum = 0;
		for(int n : nums)
		{
			if(n == 13)
				flag = true;
			else if(flag == true)
				flag = false;
			else
				sum += n;
		}
		return sum;
	}

	static boolean modThree(int[] nums)
	{
		for(int i = 0; i < nums.length - 2; i++)
		{
			if(nums[i] % 2 == nums[i + 1] % 2 && nums[i] % 2 == nums[i + 2] % 2)
				return true;
		}
		return false;
	}	
}
