package jjwu.xdeveloper.app.model;

import java.io.Serializable;

public class Mqqueue implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2894431218649647506L;

	private String host;
	
	private String virtualhost;
	
	private Queues queues;
	
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

	public Queues getQueues() {
		return queues;
	}

	public void setQueues(Queues queues) {
		this.queues = queues;
	}

	public String getPhones() {
		return phones;
	}

	public void setPhones(String phones) {
		this.phones = phones;
	}
}
