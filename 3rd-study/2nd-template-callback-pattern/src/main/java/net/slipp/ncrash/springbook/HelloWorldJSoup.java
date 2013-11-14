package net.slipp.ncrash.springbook;

import java.io.File;
import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HelloWorldJSoup {

	final static Logger logger = LoggerFactory.getLogger(HelloWorldJSoup.class);
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Document doc;
		try {
			File input = new File("/Users/ncrash/Development/repos/git/slipp/3rd-study/2nd-template-callback-pattern/src/test/resources/coupang.html");
			doc = Jsoup.parse(input, "UTF-8", "http://www.coupang.com");
			
			Element content = doc.getElementsByClass("todayList").first();
			Elements links = content.getElementsByTag("a");
			for (Element link : links) {
			  String linkHref = link.attr("href");
			  String linkText = link.text();
			  
			  logger.debug(linkHref + ":" + linkText);
			}
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
