package jjwu.xdeveloper.app.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Mqqueues implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6051008795439001410L;
	
	private List<Mqqueue> list = new ArrayList<Mqqueue>();
	
	public Mqqueue[] getMqqueue() {
		Mqqueue[] mqqueues = new Mqqueue[list.size()];
		return list.toArray(mqqueues);
	}

	public void setList(List<Mqqueue> list) {
		this.list = list;
	}
	
}
