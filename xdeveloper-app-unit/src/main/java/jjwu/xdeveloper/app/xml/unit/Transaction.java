package jjwu.xdeveloper.app.xml.unit;

public class Transaction {
	private String date;
	private String description;
	private String deposit;
	private String withdraw;
	private String balance;

	public Transaction(String adate, String adescription, String adeposit,
			String awithdraw, String abalance) {
		date = adate;
		description = adescription;
		deposit = adeposit;
		withdraw = awithdraw;
		balance = abalance;
	}

	public Transaction(int test) {
		date = "date" + test;
		description = "description" + test;
		deposit = "deposit" + test;
		withdraw = "withdraw" + test;
		balance = "balance" + test;
	}

	public String getDate() {
		return date;
	}

	public String getDescription() {
		return description;
	}

	public String getDeposit() {
		return deposit;
	}

	public String getWithdraw() {
		return withdraw;
	}

	public String getBalance() {
		return balance;
	}
}
