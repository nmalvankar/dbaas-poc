package com.rbc.db_provisioning;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Related implements java.io.Serializable {

	static final long serialVersionUID = 1L;
	private String user;
	private String activity_stream;

	// Getter Methods

	public String getUser() {
		return user;
	}

	public String getActivity_stream() {
		return activity_stream;
	}

	// Setter Methods

	public void setUser(String user) {
		this.user = user;
	}

	public void setActivity_stream(String activity_stream) {
		this.activity_stream = activity_stream;
	}

	public Related() {
	}

	public Related(java.lang.String user, java.lang.String activity_stream) {
		this.user = user;
		this.activity_stream = activity_stream;
	}
}