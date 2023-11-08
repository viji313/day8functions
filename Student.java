package day8functions;

public class Student {
	public String findTotal(int tamil,int eng, int maths,int science,int social)
	{
		return "The total is"+(tamil+eng+maths+science+social);
	}
	public void displayMarks(int a,int b, int c, int d,int e)
	{
		System.out.println("Tamil"+" "+a+" "+"English"+" "+b+"Maths"+" "+c+"Science"+" "+d+"Social"+" "+e);
	}
	public int findAvg(int tamil,int eng,int maths,int science,int social)
	{
		return (tamil+eng+maths+science+social)/5;
	}

}
