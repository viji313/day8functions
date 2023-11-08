package day8functions;

public class Vowels {
	public String findVowel(String name)
	{ int count=0;
		for(int i=0;i<name.length();i++)
		{
		
		if(name.charAt(i)=='a'|| name.charAt(i)=='e'||name.charAt(i)=='i'||name.charAt(i)=='o'||name.charAt(i)=='u')
		{count++;
			}
		}
		return "the number of vowels is"+" "+count;
	}

}
