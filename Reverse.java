package day8functions;

public class Reverse {
	public String strRev(String name)
	{
		String b=" ";
		for(int i=0;i<name.length();i++)
		{
			b=name.charAt(i)+b;
		}
		return b;
	}

}
