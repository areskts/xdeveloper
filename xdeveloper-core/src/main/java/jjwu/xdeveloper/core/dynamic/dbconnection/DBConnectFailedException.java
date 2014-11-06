/**      
* GMConnectException.java Create on 2011-12-19     
*      
* Copyright (c) 2011 by GreenShore Network
* Company: 上海绿岸网络科技有限公司(Shanghai GreenShore Network Technology Co.,Ltd.)

*/ 

package jjwu.xdeveloper.core.dynamic.dbconnection;

/** 
 * @ClassName: GMConnectException 
 * @Description: TODO(...) 
 * @author guwei
 * @date 2011-12-19 上午10:54:41 
 * @Version 1.0
 * 
 */
public class DBConnectFailedException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2111609934813652270L;

	/**
	 * 
	 */
	public DBConnectFailedException() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param arg0
	 */
	public DBConnectFailedException(String arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param arg0
	 */
	public DBConnectFailedException(Throwable arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param arg0
	 * @param arg1
	 */
	public DBConnectFailedException(String arg0, Throwable arg1) {
		super(arg0, arg1);
		// TODO Auto-generated constructor stub
	}

}
