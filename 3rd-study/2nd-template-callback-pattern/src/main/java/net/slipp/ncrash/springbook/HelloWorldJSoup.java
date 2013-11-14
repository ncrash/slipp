package net.slipp.ncrash.springbook;

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
			doc = Jsoup.connect("http://www.coupang.com/").get();
			
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
