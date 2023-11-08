package day8functions;

public class Ship implements Submarine{
	String brand;
	int price;
	String type;


public String findStrength(String type)
{
	if(type=="Military")
	{
		return "Ultra strong";
		
	}
	else
	{
		return "Strong";
	}
}
	public boolean runUndeWater(boolean runUnderwater) {
		return runUnderwater;
	
	}
}
