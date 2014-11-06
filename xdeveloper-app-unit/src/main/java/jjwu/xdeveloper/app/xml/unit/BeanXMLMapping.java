package jjwu.xdeveloper.app.xml.unit;

import com.wutka.jox.*;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* IMPORTANT:
 * BeanXMLMapping component was developed using jox library
 * http://www.wutka.com/jox.html
 * Must have jar files:
 * jox.jar, dtdparser.jar
 * and either xercer.jar or jaxp.jar and parser.jar.
 * This BeanXMLMapping version (04/07/2003)
 * uses jox116.jar, dtdparser121.jar and xercer.jar (v1.4.4)
 */
public class BeanXMLMapping {

	/**
	 * Retrieves a bean object for the received XML and matching bean class
	 */
	@SuppressWarnings("unchecked")
	public static <T> T fromXML(String xml, Class<T> className) {
		ByteArrayInputStream xmlData = new ByteArrayInputStream(xml.getBytes());
		JOXBeanInputStream joxIn = new JOXBeanInputStream(xmlData);

		try {
			return (T) joxIn.readObject(className);
		} catch (IOException exc) {
			exc.printStackTrace();
			return null;
		} finally {
			try {
				xmlData.close();
				joxIn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

	/**
	 * Returns a XML document String for the received bean
	 */
	public static String toXML(Object bean) {
		ByteArrayOutputStream xmlData = new ByteArrayOutputStream();
		JOXBeanOutputStream joxOut = new JOXBeanOutputStream(xmlData);
		try {
			joxOut.writeObject(beanName(bean), bean);
			return xmlData.toString();
		} catch (IOException exc) {
			exc.printStackTrace();
			return null;
		} finally {
			try {
				xmlData.close();
				joxOut.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * Find out the bean class name
	 */
	private static String beanName(Object bean) {
		String fullClassName = bean.getClass().getName();
		String classNameTemp = fullClassName.substring(
				fullClassName.lastIndexOf(".") + 1, fullClassName.length());
		return classNameTemp.substring(0, 1) + classNameTemp.substring(1);
	}

}
