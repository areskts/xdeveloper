package jjwu.xdeveloper.app.xml.unit;

import java.util.ArrayList;
import java.util.List;

import com.thoughtworks.xstream.XStream;

public class Test {
	/*
	 * java object to xml
	 */

	private static XmlBean xmlBean;

	public static void main(String[] args) {
		// instantiate the XStream class
		XStream xstream = new XStream();
		xstream.alias("step", Step.class);
		xstream.alias("action", Action.class);
		xstream.alias("flow", Flow.class);

		// Serializing an object to XML

		setData();

		String xml = xstream.toXML(xmlBean);
		System.out.println(xml);
	}

	public static void setData() {
		List<Step> stepList = new ArrayList<Step>();
		Step s;
		for (int i = 0; i < 5; i++) {
			s = new Step();
			s.setId(new Long(i));
			s.setSeq(new Long(i + i));
			s.setName("step" + i);
			stepList.add(s);

		}

		Action a;
		List<Action> actionList = new ArrayList<Action>();
		for (int i = 0; i < 5; i++) {
			a = new Action();
			a.setId(new Long(i));
			a.setIsSub(i + i);
			a.setName("action" + i);
			actionList.add(a);

		}

		Flow flow = new Flow();
		flow.setActionId(1L);
		flow.setClassId(3L);
		flow.setSclassId(3L);
		flow.setName("flow_analy");
		flow.setStepId(4L);
		flow.setActionId(5L);

		xmlBean = new XmlBean();
		xmlBean.setFlow(flow);
		xmlBean.setStepList(stepList);
		xmlBean.setActionList(actionList);
	}
}
