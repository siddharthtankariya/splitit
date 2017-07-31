package com.splitt.bo;

import java.util.Date;

public class TransactionsBO {
	
	private String transactionID;

	private Date createdAt;
	
	private Date editedAt;
	
	private Date deletedAt;
	
	private String createdBy;
	
	private String editedBy;
	
	private String deletedBy;
	
	private UserBO person1;
	
	private UserBO person2;
	
	private String description;
	
	private String amount;
	
	private String paidBy;
	
	private String owelent;
	
	public UserBO getPerson1() {
		return person1;
	}

	public void setPerson1(UserBO person1) {
		this.person1 = person1;
	}

	public UserBO getPerson2() {
		return person2;
	}

	public void setPerson2(UserBO person2) {
		this.person2 = person2;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}
	
	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getEditedAt() {
		return editedAt;
	}

	public void setEditedAt(Date editedAt) {
		this.editedAt = editedAt;
	}

	public Date getDeletedAt() {
		return deletedAt;
	}

	public void setDeletedAt(Date deletedAt) {
		this.deletedAt = deletedAt;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getEditedBy() {
		return editedBy;
	}

	public void setEditedBy(String editedBy) {
		this.editedBy = editedBy;
	}

	public String getDeletedBy() {
		return deletedBy;
	}

	public void setDeletedBy(String deletedBy) {
		this.deletedBy = deletedBy;
	}

	public String getPaidBy() {
		return paidBy;
	}

	public void setPaidBy(String paidBy) {
		this.paidBy = paidBy;
	}

	public String getOwelent() {
		return owelent;
	}

	public void setOwelent(String owelent) {
		this.owelent = owelent;
	}

	public String getTransactionID() {
		return transactionID;
	}

	public void setTransactionID(String transactionID) {
		this.transactionID = transactionID;
	}
	
}
