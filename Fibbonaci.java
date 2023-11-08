package day8functions;

public class Fibbonaci {
	public void findFib(int num)
	{
		int a=0;
		int b=1;
		int c=0;
		System.out.println(a);
		System.out.println(b);
		for(int i=0;i<num;i++)
		{
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
			
			
		}

	}

}
