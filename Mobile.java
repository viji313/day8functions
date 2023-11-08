package day8functions;

public class Mobile {
	String brand;
	int price;
	String color;
	int year;
	
	public Mobile findMaxPrice(Mobile[]ab)
	{
		Mobile max=ab[0];
		
		for(int i=0;i<ab.length;i++)
		{
			if(max.price<ab[i].price)
			{
			max=ab[i];
			}
			
		}
		return max;
	}
	public void findMax(Mobile[]ab)
	{
	for(int i=0;i<ab.length;i++)
	{
		if(ab[i].price>50000)
		{
			System.out.println(ab[i].brand+" "+ab[i].price+" "+ab[i].color);
		}
	}
	}

}
