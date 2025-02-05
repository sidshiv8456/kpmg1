package exceptionsUserdefined;


	public class InvalidNumber extends Exception {
		
		public InvalidNumber(){}
		
		public InvalidNumber(String msg) {
			super(msg);
		}
}
