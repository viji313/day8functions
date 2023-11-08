package day8functions;

public class UseShip {
	public static void main (String [] args) {
		String a = args[0];
		int b = Integer.parseInt(args[1]);
		String c = args[2];
		boolean d = Boolean.parseBoolean(args[3]);
		Ship s = new Ship();
		System.out.print(a+" "+b+" "+c+" "+s.runUndeWater(d));
		
	}

}
