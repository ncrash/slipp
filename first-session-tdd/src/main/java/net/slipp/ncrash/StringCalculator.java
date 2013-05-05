package net.slipp.ncrash;

public class StringCalculator {

	private int number;

	public int add(String text) {
		// TODO Auto-generated method stub
		if (text.isEmpty()) {
			return 0;
		} 
		
		if (text.contains(",")) {
			String[] tokens = text.split(",");
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
