package jjwu.xdeveloper.app.xml.unit;

import java.io.Serializable;
import java.util.List;

import jjwu.xdeveloper.app.model.Mqtotal;

public class Monitor implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2301234594035596382L;

	private String username;
	
	private String password;
	
	private List<Mqtotal> mqtotals;
	
	private List<Mqqueue> mqqueues;
	
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

	public List<Mqtotal> getMqtotals() {
		return mqtotals;
	}

	public void setMqtotals(List<Mqtotal> mqtotals) {
		this.mqtotals = mqtotals;
	}

	public List<Mqqueue> getMqqueues() {
		return mqqueues;
	}

	public void setMqqueues(List<Mqqueue> mqqueues) {
		this.mqqueues = mqqueues;
	}
	
}
