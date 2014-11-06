package jjwu.xdeveloper.app.xml.unit;

public class Account {
	private String holder;
	private String number;
	private String type;

	public Account() {
	}

	public Account(String aholder, String anumber, String atype) {
		holder = aholder;
		number = anumber;
		type = atype;
	}

	public Account(String test) {
		holder = "holder";
		number = "number";
		type = "type";
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String s) {
		holder = s;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String s) {
		number = s;
	}

	public String getType() {
		return type;
	}

	public void setType(String s) {
		type = s;
	}

}
