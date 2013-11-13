package net.slipp.ncrash;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang3.StringUtils;

public class StringCalculator {
	private static final String DEFAULT_DELIMETER = ",|\n";
	private static final String CUSTOM_DELIMETER_REGEX = "//(.)\n";
	private static final Pattern CUSTOM_PATTERN = Pattern
			.compile(CUSTOM_DELIMETER_REGEX + "(.*)");

	public int add(String text) {
		if (StringUtils.isBlank(text)) {
			return 0;
		}

		return calculateNumbers(getNumbers(text));
	}

	private String[] getNumbers(String text) {
		String delimeter = DEFAULT_DELIMETER;

		if (isCustomDelimeter(text)) {
			delimeter = getCustomDelimeter(text);
			text = removeCustomDelimeter(text);
		}
		
		return text.split(delimeter);
	}

	private String removeCustomDelimeter(String text) {
		return text.replaceAll(CUSTOM_DELIMETER_REGEX, "");
	}

	private String getCustomDelimeter(String text) {
		Matcher m = CUSTOM_PATTERN.matcher(text);
		m.find();
		return m.group(1);
	}

	private boolean isCustomDelimeter(String text) {
		return CUSTOM_PATTERN.matcher(text).matches();
	}

	private int calculateNumbers(String[] tokens) {
		int result = 0;

		for (int i = 0; i < tokens.length; i++) {
			result += Integer.parseInt(tokens[i]);
		}
		return result;
	}
}
