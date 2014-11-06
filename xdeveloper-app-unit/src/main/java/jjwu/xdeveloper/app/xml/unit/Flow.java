package jjwu.xdeveloper.app.xml.unit;

public class Flow {
	private Long id;
	private String name;
	private Long classId;
	private Long sclassId;
	private Long stepId;
	private Long actionId;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getClassId() {
		return classId;
	}

	public void setClassId(Long classId) {
		this.classId = classId;
	}

	public Long getSclassId() {
		return sclassId;
	}

	public void setSclassId(Long sclassId) {
		this.sclassId = sclassId;
	}

	public Long getStepId() {
		return stepId;
	}

	public void setStepId(Long stepId) {
		this.stepId = stepId;
	}

	public Long getActionId() {
		return actionId;
	}

	public void setActionId(Long actionId) {
		this.actionId = actionId;
	}

}
