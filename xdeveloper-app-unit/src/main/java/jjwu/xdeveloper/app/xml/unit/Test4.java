package jjwu.xdeveloper.app.xml.unit;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import com.thoughtworks.xstream.XStream;


public class Test4
{
	/**
	 * java object to xml
	 */

	public static void main(final String[] args) throws Exception
	{
		//instantiate the XStream class
		final XStream xstream = new XStream();
		xstream.alias("step", Step.class);
		xstream.alias("action", Action.class);
		xstream.alias("flow", Flow.class);

		final String xml =  readFile("/Users/jjwu/Yunio/workspace/xdeveloper/xdeveloper-app-unit/src/main/java/test.xml");
		System.out.println(xml);
		final XmlBean bean = (XmlBean)xstream.fromXML(xml);
		System.out.println(bean.getFlow().getName());


	}
	/**
	 * ��ȡ�ļ�����
	 * @param fileName
	 * @return
	 * @throws Exception
	 */
	public static String readFile(final String fileName) throws Exception {
		String fileContent = "";
		final File f = new File(fileName);
		final FileReader fileReader = new FileReader(f);
		final BufferedReader reader = new BufferedReader(fileReader);
		String line = "";
		while ((line = reader.readLine()) != null)
		{
			fileContent = fileContent + line;
		}
		reader.close();
		return fileContent;
	}
}
