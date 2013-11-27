package net.slipp.ncrash.springbook;

public enum SocialSite {
	COUPANG("http://www.coupang.com", "div.todayList:first-child"), 
	TICKET_MONSTER("http://www.ticketmonster.co.kr", "div.deal_lst_roll_dt"),
	WE_MAKE_PRICE("http://www.wemakeprice.com", "#tplBigPaging");
	
	private final String baseUri;
	private final String top5ProductCssSelector;
	
	SocialSite(String baseUri, String top5ProductCssSelector) {
		this.baseUri = baseUri;
		this.top5ProductCssSelector = top5ProductCssSelector;
	}

	public String getBaseUri() {
		return baseUri;
	}

	public String getTop5ProductCssSelector() {
		return top5ProductCssSelector;
	}
}
