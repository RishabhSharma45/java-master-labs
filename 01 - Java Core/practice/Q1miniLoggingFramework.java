package prahar.oops.practice;
import java.io.IOException;

interface Log{
	
	void info(String message);

	void debug(String message);
	
	void error(String message);
}
class ConsoleLogger implements Log{
	
	private void log(String level, String msg) {
        System.out.println("[" + level + "] " + msg);
    }

	@Override
	public void info(String message) {
		 log("INFO", message);
	}

	@Override
	public void debug(String message) {
		 log("DEBUG", message); 
		
	}

	@Override
	public void error(String message) {
		 log("ERROR", message);
		
	}
	
}
class FileLogger implements Log{

	 private static final String FILE_PATH = "app.log";

	    private void write(String level, String msg) {
	        try (java.io.FileWriter fw = new java.io.FileWriter(FILE_PATH, true)) {
	            fw.write("[" + level + "] " + msg + "\n");
	        } catch (IOException e) {
	            System.out.println("[ERROR] Unable to write in log file");
	        }
	    }
	
	@Override
	public void info(String message) {
		 write("INFO", message);
	}

	@Override
	public void debug(String message) {
		write("DEBUG", message);
	}

	@Override
	public void error(String message) {
		write("ERROR", message);
	}
	
}
class DBLogger implements Log {

    private void save(String level, String msg) {
        System.out.println("Saving to DB → [" + level + "] " + msg);
    }

    @Override
    public void info(String msg) { save("INFO", msg); }

    @Override
    public void debug(String msg) { save("DEBUG", msg); }

    @Override
    public void error(String msg) { save("ERROR", msg); }
}
class LogFactory {

    public static Log getLogger(String type) {
        if (type.equalsIgnoreCase("console"))
            return new ConsoleLogger();

        else if (type.equalsIgnoreCase("file"))
            return new FileLogger();

        else if (type.equalsIgnoreCase("db"))
            return new DBLogger();

        else
            throw new IllegalArgumentException("Invalid logger type");
    }
}

class Logic {
	
	private Log logger;

    // Dependency Injection
    public Logic(Log logger) {
        this.logger = logger;
    }

    public void execute() {
        logger.info("Inside Logic.execute()");
        logger.debug("Processing something...");

        try {
            int x = 10 / 2;
            logger.info("Result = " + x);
        } catch (Exception e) {
            logger.error("Something went wrong!");
        }
    }
	
}
public class Q1miniLoggingFramework {
	
	public static void main(String[] args) {
		
		Log logger = LogFactory.getLogger("console");
        Logic logic = new Logic(logger);
        logic.execute();

        System.out.println("\n--- Switching to File Logger ---");
        Log fileLogger = LogFactory.getLogger("file");
        new Logic(fileLogger).execute();

        System.out.println("\n--- Switching to DB Logger ---");
        Log dbLogger = LogFactory.getLogger("db");
        new Logic(dbLogger).execute();
		
	}

}
