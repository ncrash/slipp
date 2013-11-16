package net.slipp.ncrash.springbook;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

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
		List<String> todayProductList = sp.coupang(this.siteFilePath, "http://www.coupang.com");
		
		logger.debug("coupang today product : " + todayProductList.toString());
		assertThat(todayProductList.size(), is(5));
	}
	
	@Test
	public void wemakeprice() throws Exception {
		SocialProduct sp = new SocialProduct();
		
		this.siteFilePath = getClass().getClassLoader().getResource("wemakeprice.html").getPath();
		List<String> todayProductList = sp.wemakeprice(this.siteFilePath, "http://www.wemakeprice.com");
		
		logger.debug("wemakeprice today product : " + todayProductList.toString());
		assertThat(todayProductList.size(), is(5));
	}
	
	@Test
	public void tmon() throws Exception {
		SocialProduct sp = new SocialProduct();
		
		this.siteFilePath = getClass().getClassLoader().getResource("tmon.html").getPath();
		List<String> todayProductList = sp.tmon(this.siteFilePath, "http://www.ticketmonster.co.kr");
		
		logger.debug("tmon today product : " + todayProductList.toString());
		assertThat(todayProductList.size(), is(5));
	}
}
