package net.slipp.ncrash.springbook;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class SocialProduct {
	public List<String> coupang(String filePath, String baseUri) {
		List<String> todayProducts = new ArrayList<String>();
		
		Document doc;
		try {
			File input = new File(filePath);
			doc = Jsoup.parse(input, "UTF-8", baseUri);
			
			Element content = doc.getElementsByClass("todayList").first();
			Elements links = content.getElementsByTag("a");
			for (Element link : links) {
			  String linkHref = link.attr("href");
			  String linkText = link.text();
			  
			  todayProducts.add(linkHref);
			}
		} catch (NullPointerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return todayProducts;
	}
	
	public List<String> wemakeprice(String filePath, String baseUri) {
		List<String> todayProducts = new ArrayList<String>();
		
		Document doc;
		try {
			File input = new File(filePath);
			doc = Jsoup.parse(input, "UTF-8", baseUri);
			
			Element content = doc.getElementById("tplBigPaging");
			Elements links = content.getElementsByTag("a");
			for (Element link : links) {
			  String linkHref = link.attr("href");
			  String linkText = link.text();
			  
			  todayProducts.add(linkHref);
			}
		} catch (NullPointerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return todayProducts;
	}
	
	public List<String> tmon(String filePath, String baseUri) {
		List<String> todayProducts = new ArrayList<String>();
		
		Document doc;
		try {
			File input = new File(filePath);
			doc = Jsoup.parse(input, "UTF-8", baseUri);
			
			Element content = doc.getElementsByClass("deal_lst_roll_dt").first();
			Elements links = content.getElementsByTag("a");
			for (Element link : links) {
			  String linkHref = link.attr("href");
			  String linkText = link.text();
			  
			  todayProducts.add(linkHref);
			}
		} catch (NullPointerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return todayProducts;
	}
}
