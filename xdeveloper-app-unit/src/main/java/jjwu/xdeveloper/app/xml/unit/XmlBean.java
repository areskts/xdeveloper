package jjwu.xdeveloper.app.xml.unit;

import java.util.List;

public class XmlBean {
	private Flow flow;
	private List<Step> stepList;
	private List<Action> actionList;

	public Flow getFlow() {
		return flow;
	}

	public void setFlow(Flow flow) {
		this.flow = flow;
	}

	public List<Step> getStepList() {
		return stepList;
	}

	public void setStepList(List<Step> stepList) {
		this.stepList = stepList;
	}

	public List<Action> getActionList() {
		return actionList;
	}

	public void setActionList(List<Action> actionList) {
		this.actionList = actionList;
	}

}
