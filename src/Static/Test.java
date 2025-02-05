package Static;

public class Test {
	public static void main(String[] args) {
		sample day = sample.MONDAY;
		switch(day)
		{
		case MONDAY:
			System.out.println("Working day");
			break;
		case TUESDAY:
			System.out.println("Working day");
			break;
		case WEDNESDAY:
			System.out.println("Working day");
			break;
		case THURSDAY:
			System.out.println("Working day");
			break;
		case FRIDAY:
			System.out.println("Working day");
			break;
		case SATURDAY:
			System.out.println("Working day");
			break;
		case SUNDAY:
			System.out.println("Working day");
			break;
			
		}
		sample[] d=new sample[7];
		int a=0;
		d[6]=sample.SUNDAY;
		for(sample x:sample.values()) {
			if(x==sample.SUNDAY)
				continue;
			d[a++]=x;
		}
		for(sample x:d ) {
			System.out.println(x);
		}
		
		
		
	}
}
