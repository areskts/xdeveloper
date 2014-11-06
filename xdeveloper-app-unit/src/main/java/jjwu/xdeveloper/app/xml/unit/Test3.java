package jjwu.xdeveloper.app.xml.unit;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import jjwu.xdeveloper.app.model.Mqtotal;
import jjwu.xdeveloper.app.model.Queue;

import com.thoughtworks.xstream.XStream;

public class Test3 {

	
	public static void main(String[] args) throws Exception {
		XStream xstream = new XStream();
		
		xstream.alias("queue", Queue.class);
		xstream.alias("monitor", Monitor.class);
		xstream.alias("mqtotal", Mqtotal.class);
		xstream.alias("mqqueue", Mqqueue.class);
		

		// Serializing an object to XML

		String xml = readFile("/Users/wujunjie/Documents/workspaces/xdeveloper/xdeveloper-app-unit/src/main/java/example.xml");
		System.out.println(xml);
		Monitor bean = (Monitor) xstream.fromXML(xml);
		System.out.println(bean.getPassword());
		System.out.println(bean.getMqtotals().get(0).getId());
	}

	public static String readFile(String fileName) throws Exception {
		String fileContent = "";
		File f = new File(fileName);
		FileReader fileReader = new FileReader(f);
		BufferedReader reader = new BufferedReader(fileReader);
		String line = "";
		while ((line = reader.readLine()) != null) {
			fileContent = fileContent + line;
		}
		reader.close();
		return fileContent;
	}
}
