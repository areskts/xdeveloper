package jjwu.xdeveloper.app.model;

import java.io.Serializable;

public class Queue implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6333035447803942155L;

	private String name;
	
	private int maxwarn;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMaxwarn() {
		return maxwarn;
	}

	public void setMaxwarn(int maxwarn) {
		this.maxwarn = maxwarn;
	}
	
}
