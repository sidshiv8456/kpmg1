package exceptionsUserdefined;

public class Test {
	public static void main(String[] args) {
		card n = new card();
		try {
			n.check("1234567891234544");
		}
		catch(InvalidNumber e) {
			System.out.println(e.getMessage());
		}
	}
}
