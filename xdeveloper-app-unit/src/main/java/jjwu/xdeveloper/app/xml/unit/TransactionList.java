package jjwu.xdeveloper.app.xml.unit;

import java.util.ArrayList;
import java.util.List;

public class TransactionList {

	private List<Transaction> list = new ArrayList<Transaction>();

	public TransactionList(String test) {
		Transaction transaction;
		for (int i = 0; i < 4; i++) {
			transaction = new Transaction(i);
			list.add(transaction);
		}
	}

	public Transaction[] getTransaction() {
		Transaction[] transactionArray = new Transaction[list.size()];
		return (Transaction[]) list.toArray(transactionArray);
	}

	public boolean addTransaction(Transaction aTransaction) {
		return list.add(aTransaction);
	}

}
