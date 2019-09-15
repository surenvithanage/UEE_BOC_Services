package com.uee.boc.mapping;

import static javax.persistence.GenerationType.IDENTITY;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "beneficiary", catalog = "uee")
public class Beneficiary implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1640601718575399292L;
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "beneficiaryId", unique = true, nullable = false)
	private Long beneficiaryId;
	private String name;
	private String nickName;
	private String accountNumber;
	private String email;

	public Beneficiary(Long beneficiaryId, String name, String nickName, String accountNumber, String email) {
		super();
		this.beneficiaryId = beneficiaryId;
		this.name = name;
		this.nickName = nickName;
		this.accountNumber = accountNumber;
		this.email = email;
	}

	public Long getBeneficiaryId() {
		return beneficiaryId;
	}

	public void setBeneficiaryId(Long beneficiaryId) {
		this.beneficiaryId = beneficiaryId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
