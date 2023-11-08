package day8functions;

public class UsePencil {
	public static void main(String[]args)
	{
		Pencil p1= new Pencil();
		p1.price=1000;
		p1.tax=20;
		p1.dis=30;
		p1.taxper=5;
		p1.disAmt=25;
		System.out.println(p1.findNetPrice());
		System.out.println(p1.taxAmount());
		System.out.println(p1.disAmount());
	}

}
