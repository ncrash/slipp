package net.slipp.ncrash;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringCalculator {

	private int number;

	public int add(String text) {
		if (text.isEmpty()) {
			return 0;
		}

		if (text.startsWith("//")) {
			Matcher m = Pattern.compile("//(.)\n(.*)").matcher(text);
			m.find();
			String customDelimeter = m.group(1);
			String[] customDelimeterResult = m.group(2).split(customDelimeter);
			number = 0;
			
			for (int i = 0; i < customDelimeterResult.length; i++) {
					number += Integer.parseInt(customDelimeterResult[i]);
			}
		} else if (text.contains(",")) {
			String[] tokens = text.split(",|\n");
			number = 0;

			for (int i = 0; i < tokens.length; i++) {
				number += Integer.parseInt(tokens[i]);
			}
		} else {
			number = Integer.parseInt(text);
		}

		return number;
	}

}
