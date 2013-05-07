package net.slipp.ncrash;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringCalculator {

	private int result;
	private String[] numbers;

	public int add(String text) {
		
		if (text.isEmpty()) {
			return 0;
		}
		
		calculateNumbers(getNumbers(text));

		return result;
	}

	private String[] getNumbers(String text) {
		if (text.startsWith("//")) {
			numbers = getNumbersUsingCustomDelimeter(text);
		} else {
			numbers = getNumbersUsingBasicDelimeter(text);
		}
		
		return numbers;
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

	private void calculateNumbers(String[] tokens) {
		if (tokens != null) {
			for (int i = 0; i < tokens.length; i++) {
				result += Integer.parseInt(tokens[i]);
			}
		}
	}
}
