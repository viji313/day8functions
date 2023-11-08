package day8functions;

public class Palindrome {
	public String findPalin(String name) {
		String nam2 = "";
		for (int i = name.length()-1; i >= 0; i--) {
			nam2 = nam2 + name.charAt(i);
		}
			if (nam2.equals(name)) {
				return "palindrome";
			} else {
				return "not palindrome";
			}
		}
	}

