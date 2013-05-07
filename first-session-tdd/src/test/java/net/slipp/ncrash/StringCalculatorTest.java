package net.slipp.ncrash;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

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
	
	@Test
	public void 숫자_두개를_컴마_구분자로_입력할_경우_두_숫자의_합을_반환한다() throws Exception {
		assertThat(calculator.add("1,2"), equalTo(3));
	}
	
	@Test
	public void 세_개_이상의_숫자를_컴마_구분자로_입력할_경우_모든_숫_자의_합을_반환한다() throws Exception {
		assertThat(calculator.add("1,2,3"), equalTo(6));
	}
	
	@Test
	public void 구분자를_컴마_이외에_New_Line을_사용할_수_있다() throws Exception {
		assertThat(calculator.add("1,2\n3"), equalTo(6));
	}
	
	@Test
	public void 더블_슬레쉬를_사용해_커스텀_구분자를_지정할_수_있다() throws Exception {
		assertThat(calculator.add("//;\n1;2;3"), equalTo(6));
	}
}
