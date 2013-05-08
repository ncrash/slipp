package net.slipp.ncrash;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang3.StringUtils;

public class StringCalculator {

	public int add(String text) {
		if (StringUtils.isBlank(text)) {
			return 0;
		}
		
		return calculateNumbers(getNumbers(text));
	}

	private String[] getNumbers(String text) {
		if (text.startsWith("//")) {
			return getNumbersUsingCustomDelimeter(text);
		} else {
			return getNumbersUsingBasicDelimeter(text);
		}
	}

	private String[] getNumbersUsingBasicDelimeter(String text) {
		String[] tokens = text.split(",|\n");
		return tokens;
	}

	private String[] getNumbersUsingCustomDelimeter(String text) {
		Matcher m = Pattern.compile("//(.)\n(.*)").matcher(text);
		m.find();
		String customDelimeter = m.group(1);
		String[] customDelimeterResult = m.group(2).split(customDelimeter);
		return customDelimeterResult;
	}

	private int calculateNumbers(String[] tokens) {
		int result = 0;
		if (tokens == null) {
			return 0;
		}
		
		for (int i = 0; i < tokens.length; i++) {
			result += Integer.parseInt(tokens[i]);
		}
		return result;
	}
}
