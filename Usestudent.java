package day8functions;

public class Usestudent {
	public static void main(String[]args)
	{
		Student s1= new Student();
		System.out.println(s1.findTotal(67, 67, 80, 90, 100));
		s1.displayMarks(40,50,60,70,67);
		System.out.println(s1.findAvg(67,89,100,50,100));
	}

}
