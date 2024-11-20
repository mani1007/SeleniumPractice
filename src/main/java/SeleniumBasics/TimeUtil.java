package SeleniumBasics;

public class TimeUtil {
	
	private final static int DEFAULT_TIME = 500;
	private final static int SHORT_TIME = 2000;
	private final static int MEDIUM_TIME = 5000;
	private final static int LONG_TIME = 10000;
	private final static int MAX_TIME = 15000;
	
	
	public static void myCustomTime(int MyWaitTime) {
		try {
			Thread.sleep(MyWaitTime * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void defaultTime() {
		try {
			Thread.sleep(DEFAULT_TIME);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void shortTime() {
		try {
			Thread.sleep(SHORT_TIME);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void mediumTime() {
		try {
			Thread.sleep(MEDIUM_TIME);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void longTime() {
		try {
			Thread.sleep(LONG_TIME);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void maxTime() {
		try {
			Thread.sleep(MAX_TIME);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
