package jjwu.xdeveloper.app.xml.unit;

import java.io.Serializable;
import java.util.List;

import jjwu.xdeveloper.app.model.Queue;

public class Mqqueue implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2894431218649647506L;

	private String host;
	
	private String virtualhost;
	
	private List<Queue> queues;
	
	private String phones;

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public String getVirtualhost() {
		return virtualhost;
	}

	public void setVirtualhost(String virtualhost) {
		this.virtualhost = virtualhost;
	}

	
	public List<Queue> getQueues() {
		return queues;
	}

	public void setQueues(List<Queue> queues) {
		this.queues = queues;
	}

	public String getPhones() {
		return phones;
	}

	public void setPhones(String phones) {
		this.phones = phones;
	}
}
