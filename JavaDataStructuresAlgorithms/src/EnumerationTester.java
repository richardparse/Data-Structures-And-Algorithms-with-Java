import java.util.Vector;
import java.util.Enumeration;

public class EnumerationTester {

	public static void main(String[] args) {
		
		Enumeration days = null;
		Vector dayNames = new Vector();
		dayNames.add("Sunday");
		dayNames.add("Monday");
		dayNames.add("Tuesday");
		dayNames.add("Wednesday");
		dayNames.add("Thursday");
		dayNames.add("Friday");
		dayNames.add("Saturday");
		while (days.hasMoreElements()) {
			System.out.println(days.nextElement());
		}

	}

}
