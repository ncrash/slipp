package net.slipp.ncrash;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import junit.framework.TestCase;
import org.junit.Test;

public class StringCalculatorTest {

	@Test
	public void 빈_문자열을_입력할_경우_0을_반환해야_한다() throws Exception {
		StringCalculator calculator = new StringCalculator();
		
		assertThat(calculator.add(""), equalTo(0));
	}

}
