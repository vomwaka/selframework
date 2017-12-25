package utility;

	import org.apache.log4j.Logger;

	public class Log {

		//Initializing Log4j logs
		private static Logger Log = Logger.getLogger(Log.class.getName());

	//Printing log for the beginning of the test case.
	public static void startTestCase(String sTestCaseName){

	   Log.info("****************************************************************************************");
	   Log.info("****************************************************************************************");
	   Log.info("$$$$$$$$$$$$$$$$$$$$$                 "+sTestCaseName+ "       $$$$$$$$$$$$$$$$$$$$$$$$$");
	   Log.info("****************************************************************************************");
	   Log.info("****************************************************************************************");

	   }

	//Printing log for the ending of the test case
	public static void endTestCase(String sTestCaseName){
	   Log.info("XXXXXXXXXXXXXXXXXXXXXXX "+"-E---N---D-"+"  XXXXXXXXXXXXXXXXXXXXXX");
	   Log.info("X");
	   Log.info("X");
	   Log.info("X");
	   Log.info("X");

	   }

    // Methods to be called latter 
	public static void info(String message)
	{
	   Log.info(message);
	   }

	public static void warn(String message)
	{
	   Log.warn(message);
	   }

	public static void error(String message) 
	{
	   Log.error(message);
	   }

	public static void fatal(String message) 
	{
	   Log.fatal(message);
	   }

	public static void debug(String message) {
	   Log.debug(message);
	   }

	}