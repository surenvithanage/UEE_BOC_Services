package com.uee.boc.dto;

import java.util.Date;

public class UserDTO {
	private Long userId;
	private String loginId;
	private String password;
	private Date createdtime;
	private String name;
	private String mobile;
	private Long channel;
	private String pushId;
	private String loginIdType;
	private String email;
	private boolean isEnabled;

	public UserDTO() {
	}

	public UserDTO(Long userId, String loginId, String password, Date createdtime, String name, String mobile,
			Long channel, String pushId, String loginIdType, String email, boolean isEnabled) {
		super();
		this.userId = userId;
		this.loginId = loginId;
		this.password = password;
		this.createdtime = createdtime;
		this.name = name;
		this.mobile = mobile;
		this.channel = channel;
		this.pushId = pushId;
		this.loginIdType = loginIdType;
		this.email = email;
		this.isEnabled = isEnabled;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getLoginId() {
		return loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getCreatedtime() {
		return createdtime;
	}

	public void setCreatedtime(Date createdtime) {
		this.createdtime = createdtime;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public Long getChannel() {
		return channel;
	}

	public void setChannel(Long channel) {
		this.channel = channel;
	}

	public String getPushId() {
		return pushId;
	}

	public void setPushId(String pushId) {
		this.pushId = pushId;
	}

	public String getLoginIdType() {
		return loginIdType;
	}

	public void setLoginIdType(String loginIdType) {
		this.loginIdType = loginIdType;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isEnabled() {
		return isEnabled;
	}

	public void setEnabled(boolean isEnabled) {
		this.isEnabled = isEnabled;
	}

}
