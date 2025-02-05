package exceptionsUserdefined;

public class Election {
	public void checkEligiobility(int number) throws InvalidAgeException
	{
	if(number < 16 ) 
		throw new InvalidAgeException("Invalid number for credit card");

	else 
		System.out.println("oh oh  oh");
}
}
