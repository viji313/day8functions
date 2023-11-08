package day8functions;

public class Minimum {
	public int findMin(int[] arr) {
		int min = arr[0];
		for (int b : arr) {
			if (b < min) {
				min = b;

			}
		}
			return min;
		
	}
	public void findEven(int a[])
	{
		
		for(int b:a)
		{
			if(b%2==0)
				System.out.println(b+1);
		}
	}
}
