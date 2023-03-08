package DATE;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

public class DateDiffDemo {

	public static void main(String[] args)throws ParseException {
		
	    SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
        Date firstDate       = sdf.parse("10/23/2021");
        Date secondDate = sdf.parse("10/24/2021");
		
		long diff = secondDate.getTime() - firstDate.getTime();
		System.out.println("Diff in Milli Seconds" + diff);
	
		long daysDiff   = Duration.ofMillis(diff).toDays();
		long hoursDiff  = Duration.ofMillis(diff).toHours();
		System.out.println("daysDiff  : " + daysDiff );
		System.out.println("hoursDiff : " + hoursDiff );
	}

}
