package day8functions;

public class Maximum {
	public String findMax(int[]a)
	{
		int max=a[0];
		for(int b:a)
		{
			if(b>max)
			{
				max=b;

				
			}
						}
		return "The maximum value is" + " "+max;
	}
}
