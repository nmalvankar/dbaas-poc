package com.rbc.db_provisioning;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class QuartelySchedule implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private boolean enabled;
	private java.lang.String startMonth;
	private int dayOfMonth;

	public QuartelySchedule() {
	}

	public boolean isEnabled() {
		return this.enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public java.lang.String getStartMonth() {
		return this.startMonth;
	}

	public void setStartMonth(java.lang.String startMonth) {
		this.startMonth = startMonth;
	}

	public int getDayOfMonth() {
		return this.dayOfMonth;
	}

	public void setDayOfMonth(int dayOfMonth) {
		this.dayOfMonth = dayOfMonth;
	}

	public QuartelySchedule(boolean enabled, java.lang.String startMonth,
			int dayOfMonth) {
		this.enabled = enabled;
		this.startMonth = startMonth;
		this.dayOfMonth = dayOfMonth;
	}

}