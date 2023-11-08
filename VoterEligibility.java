package day8functions;

public class VoterEligibility {
	public String check(int age)
	{
		 if(age>=18)
		{
			return "Eligibility to vote";
		}
		 else
		 {
			 return "Not eligibility";
		 }
	}

}
