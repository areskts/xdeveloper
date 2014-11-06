package jjwu.xdeveloper.app.model;

import java.io.Serializable;

public class Monitor implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2301234594035596382L;

	private String username;
	
	private String password;
	
	private Mqtotals mqtotals;
	
	private Mqqueues mqqueues;
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


	public Mqtotals getMqtotals() {
		return mqtotals;
	}

	public void setMqtotals(Mqtotals mqtotals) {
		this.mqtotals = mqtotals;
	}

	public Mqqueues getMqqueues() {
		return mqqueues;
	}

	public void setMqqueues(Mqqueues mqqueues) {
		this.mqqueues = mqqueues;
	}
}
