package jjwu.xdeveloper.app.xml.unit;

public class AccountHistory {
	private TransactionList transactionList;
	private AccountHistoryContext accountHistoryContext;

	public AccountHistory(String test) {
		transactionList = new TransactionList("test");
		accountHistoryContext = new AccountHistoryContext("test");
	}

	public AccountHistory(TransactionList atransactionList, AccountHistoryContext aaccountHistoryContext) {
		transactionList = atransactionList;
		accountHistoryContext = aaccountHistoryContext;
	}

	public TransactionList getTransactionList() {
		return transactionList;
	}

	public AccountHistoryContext getAccountHistoryContext() {
		return accountHistoryContext;
	}

	public String toXML() {
		return BeanXMLMapping.toXML(this);
	}

}
