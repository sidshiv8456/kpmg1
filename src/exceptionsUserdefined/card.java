package exceptionsUserdefined;

public class card {
	public void check(String number) throws InvalidNumber{
		if(number.length() !=16  ) {
			throw new InvalidNumber("invalid");
		}
		else if
			(number.length() !=12) {
			throw new InvalidNumber("invalid");
		}
		
		else {
			System.out.println("OK");
		}
}
}
