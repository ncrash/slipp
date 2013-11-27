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

	public List<String> getTop5Product(final SocialSite socialSite, String siteFilePath) throws Exception {
		ContentElementCallBack callback = new ContentElementCallBack() {
			@Override
			public Element doGetProductElementWithDocument(Document doc) throws Exception {
				Element content = doc.select(socialSite.getTop5ProductCssSelector()).first();
				return content;
			}
		};
		
		return this.getTop5ProductTemplate(siteFilePath, socialSite.getBaseUri(), callback);
	}
	
	public List<String> getTop5ProductTemplate(String filePath, String baseUri, ContentElementCallBack callback) throws Exception {
		List<String> todayProducts = new ArrayList<String>();

		int count = 0;
		Document doc;
		try {
			File input = new File(filePath);
			doc = Jsoup.parse(input, "UTF-8", baseUri);

			Element content = callback.doGetProductElementWithDocument(doc);
			Elements links = content.getElementsByTag("a");
			for (Element link : links) {
				if (count >= 5) {
					break;
				}
				String linkHref = link.attr("href");

				todayProducts.add(linkHref);
				count++;
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
