package jjwu.xdeveloper.app.xml.unit;

public class AccountHistoryContext {
	private String dateFrom;
	private String dateTo;
	private Account account;

	public AccountHistoryContext() {
	}

	public AccountHistoryContext(String adateFrom, String adateTo,
			Account aaccount) {
		dateFrom = adateFrom;
		dateTo = adateTo;
		account = aaccount;
	}

	public AccountHistoryContext(String test) {
		dateFrom = "dateFrom";
		dateTo = "dateTo";
		account = new Account("test");
	}

	public String getDateFrom() {
		return dateFrom;
	}

	public void setDateFrom(String s) {
		dateFrom = s;
	}

	public String getDateTo() {
		return dateTo;
	}

	public void setDateTo(String s) {
		dateTo = s;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account o) {
		account = o;
	}

	public String toXML() {
		return BeanXMLMapping.toXML(this);
	}

	public static Object fromXML(String xml) {
		return (AccountHistoryContext) BeanXMLMapping.fromXML(xml,AccountHistoryContext.class);
	}

}
