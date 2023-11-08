package day8functions;

public class UseMobile {
	public static void main(String[]args)
	{
	Mobile m = new Mobile();
	m.brand="vivo";
	m.price=50000;
	m.color="white";
	m.year=2019;
	
	Mobile m1 = new Mobile();
	m1.brand="samsung";
	m1.price=52000;
	m1.color="silver";
	m1.year=2019;
	
	Mobile m2 = new Mobile();
	m2.brand="samsung";
	m2.price=16000;
	m2.color="silver";
	m2.year=2019;
	
	Mobile m3 = new Mobile();
	m3.brand="samsung";
	m3.price=76000;
	m3.color="silver";
	m3.year=2019;

Mobile mob[]= {m,m1,m2,m3};
Mobile mobMax=m.findMaxPrice(mob);

System.out.println(mobMax.brand+" "+mobMax.color+" "+mobMax.price);
m3.findMax(mob);
}
}
