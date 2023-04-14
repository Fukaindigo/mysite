package com.site.enitity;

import java.util.Date;

public class SiteUser {
	private long userId;
	private String email;
	private String password;
	private String name;

	private int delFlag = 0;
	private int regFlag = 0;
	private Date regDate;

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDelFlag() {
		return delFlag;
	}

	public void setDelFlag(int delFlag) {
		this.delFlag = delFlag;
	}

	public int getRegFlag() {
		return regFlag;
	}

	public void setRegFlag(int regFlag) {
		this.regFlag = regFlag;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

}
