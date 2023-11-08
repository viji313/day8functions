package day8functions;

public class Name {
	public String findVowels(String name)
	{
		if(name.contains("a")||name.contains("e")||name.contains("i")||name.contains("o")||name.contains("u"))
		{
			return "vowels present";
			
		}
		else
		{
			return "vowels not present";
		}
	}

}
