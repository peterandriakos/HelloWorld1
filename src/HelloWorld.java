
public class HelloWorld {

	public static void main(String[] args) {
		
		System.out.println("Hello World!");
		/* Issue1: Display total amount of free memory available to the JVM/User */
		 System.out.println
		 	("Free memory (bytes): " + Runtime.getRuntime().freeMemory());
		/* Issue2: Display the current date to the user */
		System.out.print
			(java.time.format.DateTimeFormatter.RFC_1123_DATE_TIME.format
				(java.time.ZonedDateTime.now()).replaceFirst(".....$", "GMT") + ": "); 	// replace UTC offset with GMT
	}

}
