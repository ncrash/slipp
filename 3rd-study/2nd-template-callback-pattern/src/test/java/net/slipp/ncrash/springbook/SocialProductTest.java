package net.slipp.ncrash.springbook;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SocialProductTest {

	final static Logger logger = LoggerFactory.getLogger(SocialProductTest.class);
	
	SocialProduct socialProduct;
	String siteFilePath;
	
	@Before public void setUp() {
		this.socialProduct = new SocialProduct();
	}

	@Test
	public void coupang() throws Exception {
		SocialProduct sp = new SocialProduct();
		
		this.siteFilePath = getClass().getClassLoader().getResource("coupang.html").getPath();
		List<String> coupang = sp.coupang(this.siteFilePath, "http://www.coupang.com");
		
		logger.debug(coupang.toString());
	}
}
