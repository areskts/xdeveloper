package jjwu.xdeveloper.app.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Queues implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6598540435118227200L;
	
	
	private List<Queue> list = new ArrayList<Queue>();

	public Queue[] getQueue() {
		Queue[] queues = new Queue[list.size()];
		return list.toArray(queues);
	}

	public void setList(List<Queue> list) {
		this.list = list;
	}
}
