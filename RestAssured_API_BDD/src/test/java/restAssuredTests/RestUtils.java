package restAssuredTests;

import org.apache.commons.lang3.RandomStringUtils;

public class RestUtils {
	
	public static String getRandomUserName() {
		String returnUserNamestring = RandomStringUtils.randomAlphabetic(5);
		return ("John" +returnUserNamestring);
	}
	public static String getRandomFirstName() {
		String returnFirstNamestring = RandomStringUtils.randomAlphabetic(5);
		return ("Doe" +returnFirstNamestring);
	}
	public static String getRandomLastName() {
		String returnFirstNamestring = RandomStringUtils.randomAlphabetic(5);
		return ("Kenedy" +returnFirstNamestring);
	}
	public static String getRandomPassword() {
		String returnFirstNamestring = RandomStringUtils.randomAlphabetic(5);
		return ("Wipro@" +returnFirstNamestring);
	}
	public static String getRandomEmail() {
		String returnFirstNamestring = RandomStringUtils.randomAlphabetic(5);
		return (returnFirstNamestring+"@gmail.com");
	}
}
