package com.rbc.db_provisioning;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Greeting implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private java.lang.String name;

	private java.lang.String language;

	private java.lang.String audience;

	public Greeting() {
	}

	public java.lang.String getName() {
		return this.name;
	}

	public void setName(java.lang.String name) {
		this.name = name;
	}

	public java.lang.String getLanguage() {
		return this.language;
	}

	public void setLanguage(java.lang.String language) {
		this.language = language;
	}

	public java.lang.String getAudience() {
		return this.audience;
	}

	public void setAudience(java.lang.String audience) {
		this.audience = audience;
	}

	public Greeting(java.lang.String name, java.lang.String language,
			java.lang.String audience) {
		this.name = name;
		this.language = language;
		this.audience = audience;
	}

}