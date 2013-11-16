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
		assertThat(todayProductList.get(0), is("/deal.pang?coupang=48884870&areacode=MB&order=1"));
		assertThat(todayProductList.get(1), is("/deal.pang?coupang=48884870&areacode=MB&order=1"));
		assertThat(todayProductList.get(2), is("/deal.pang?coupang=49080218&areacode=MB&order=2"));
		assertThat(todayProductList.get(3), is("/deal.pang?coupang=49080218&areacode=MB&order=2"));
		assertThat(todayProductList.get(4), is("/deal.pang?coupang=48822408&areacode=MB&order=3"));
	}
	
	@Test
	public void wemakeprice() throws Exception {
		SocialProduct sp = new SocialProduct();
		
		this.siteFilePath = getClass().getClassLoader().getResource("wemakeprice.html").getPath();
		List<String> todayProductList = sp.wemakeprice(this.siteFilePath, "http://www.wemakeprice.com");
		
		logger.debug("wemakeprice today product : " + todayProductList.toString());
		assertThat(todayProductList.size(), is(5));
		assertThat(todayProductList.get(0), is("http://pubads.g.doubleclick.net/gampad/jump?iu=/21948295/big_01_1326x340&sz=1326x340&c=1486657768&t=gender%3Dunknown%26age%3Dunknown"));
		assertThat(todayProductList.get(1), is("http://pubads.g.doubleclick.net/gampad/jump?iu=/21948295/big_02_1326x340&sz=1326x340&c=1317307108&t=gender%3Dunknown%26age%3Dunknown"));
		assertThat(todayProductList.get(2), is("http://pubads.g.doubleclick.net/gampad/jump?iu=/21948295/big_03_1326x340&sz=1326x340&c=1467005572&t=gender%3Dunknown%26age%3Dunknown"));
		assertThat(todayProductList.get(3), is("http://pubads.g.doubleclick.net/gampad/jump?iu=/21948295/big_04_1326x340&sz=1326x340&c=1657990271&t=gender%3Dunknown%26age%3Dunknown"));
		assertThat(todayProductList.get(4), is("http://pubads.g.doubleclick.net/gampad/jump?iu=/21948295/big_05_1326x340&sz=1326x340&c=12740207&t=gender%3Dunknown%26age%3Dunknown"));
	}
	
	@Test
	public void tmon() throws Exception {
		SocialProduct sp = new SocialProduct();
		
		this.siteFilePath = getClass().getClassLoader().getResource("tmon.html").getPath();
		List<String> todayProductList = sp.tmon(this.siteFilePath, "http://www.ticketmonster.co.kr");
		
		logger.debug("tmon today product : " + todayProductList.toString());
		assertThat(todayProductList.size(), is(5));
		assertThat(todayProductList.get(0), is("/deal/38642685/101001?utm=TODAYSHOT&loc=25"));
		assertThat(todayProductList.get(1), is("/deal/38841901/101001?utm=TODAYSHOT&loc=26"));
		assertThat(todayProductList.get(2), is("/deal/39614561/101001?utm=TODAYSHOT&loc=27"));
		assertThat(todayProductList.get(3), is("/deal/38483317/101001?utm=TODAYSHOT&loc=28"));
		assertThat(todayProductList.get(4), is("/deal/39611129/101001?utm=TODAYSHOT&loc=29"));
	}
}
