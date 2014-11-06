package jjwu.xdeveloper.app.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


public class Mqtotals implements Serializable {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6598540435118227200L;
	
	
	private List<Mqtotal> list = new ArrayList<Mqtotal>();

	public Mqtotal[] getMqtotal() {
		Mqtotal[] mqtotals = new Mqtotal[list.size()];
		return list.toArray(mqtotals);
	}

	public void setList(List<Mqtotal> list) {
		this.list = list;
	}
}
