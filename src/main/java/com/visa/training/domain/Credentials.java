package com.visa.training.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Credentials {
	
	@Id
	private String eid;
	private String password;
	private String discriminator;

	public String getUserId() {
		return eid;
	}

	public void setUserId(String userId) {
		this.eid = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDiscriminator() {
		return discriminator;
	}

	public void setDiscriminator(String discriminator) {
		this.discriminator = discriminator;
	}

}
