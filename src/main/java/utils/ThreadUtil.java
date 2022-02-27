package utils;

import org.apache.commons.lang3.ThreadUtils;

import java.time.Duration;

/**
 * @author Diablo73
 * @version 1.0 <br> 27/02/2022
 * @since 27/02/2022
 */

public class ThreadUtil {

	public static void wait(int ms) {
		try {
			Thread.sleep(ms);
		} catch(InterruptedException ex) {
			Thread.currentThread().interrupt();
		}
	}

	public static void sleep(int ms) {
		try {
			ThreadUtils.sleep(Duration.ofMillis(ms));
		} catch(InterruptedException ex) {
			Thread.currentThread().interrupt();
		}
	}
}
