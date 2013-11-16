package net.slipp.ncrash.springbook;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public interface ContentElementCallBack {
	Element doGetProductElementWithDocument(Document doc) throws Exception; 
}
