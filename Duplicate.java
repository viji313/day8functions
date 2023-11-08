package day8functions;

public class Duplicate {
	public void findDup(int a[])
	
	{
		
	for(int i=0;i<a.length;i++)
	{
		int count=0;
		
		for(int j=i+1;j<a.length;j++)
		{
			if(a[i]==a[j]);
			{
				
				count++;
			}
			
		}
		System.out.println( count);
	}
		
		
		
	

}
}
