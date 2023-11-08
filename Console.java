package day8functions;

public class Console {
	public int findCons(String name)
	{
		int count=0;
		for(int i=0;i<name.length();i++)
		{
		
		
			if(name.charAt(i)!='a'&& name.charAt(i)!='e'&& name.charAt(i)!='i'&& name.charAt(i)!='o'&& name.charAt(i)=='u')
			{
				count++;
			}
		}
		return count;
		
	}

}
