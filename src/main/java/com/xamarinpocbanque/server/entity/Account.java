package com.xamarinpocbanque.server.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Account {

	@Id
    @SequenceGenerator(name = "xambanque_uid", sequenceName = "xambanque_uid", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "xambanque_uid")
    @Column(name="id")
	private Long id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="number")
	private String number;
	
	@Column(name="solde")
	private Long solde;
	
	@Column(name="user_id")
	private Long userId;
	
	@Column(name="iban")
	private String iban;

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

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public Long getSolde() {
		return solde;
	}

	public void setSolde(Long solde) {
		this.solde = solde;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getIban() {
		return iban;
	}

	public void setIban(String iban) {
		this.iban = iban;
	}
	
	
	
}
