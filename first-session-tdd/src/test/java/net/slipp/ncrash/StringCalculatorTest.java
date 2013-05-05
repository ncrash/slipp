package net.slipp.ncrash;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

import junit.framework.TestCase;

import org.junit.Before;
import org.junit.Test;

public class StringCalculatorTest {

	StringCalculator calculator;
	
	@Before
	public void setUp() throws Exception {
		calculator = new StringCalculator();
	}

	@Test
	public void 빈_문자열을_입력할_경우_0을_반환해야_한다() throws Exception {
		
		assertThat(calculator.add(""), equalTo(0));
	}

	@Test
	public void 숫자_하나를_문자열로_입력할_경우_해당_숫자를_반환한다() throws Exception {
		assertThat(calculator.add("1"), equalTo(1));
	}
}
