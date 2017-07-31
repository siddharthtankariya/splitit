package com.splitt.bo;

import java.util.Date;
import java.util.List;

public class TransactionGroupBO {
	
	private String transactionGroupID;
	
	private String createdBy;
	
	private String deletedBy;
	
	private String editedBy;
	
	private Date createdAt;
	
	private Date deletedAt;
	
	private Date editedAt;
	
	private String paidBy;

	private List<UserBO> persons;
	
	private String description;
	
	private String singleAmount;
	
	private List<String> amount;
	
	private String splitMethod;
	
	private List<String> percent;

	public List<UserBO> getPersons() {
		return persons;
	}

	public void setPersons(List<UserBO> persons) {
		this.persons = persons;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<String> getAmount() {
		return amount;
	}

	public void setAmount(List<String> amount) {
		this.amount = amount;
	}

	public String getSplitMethod() {
		return splitMethod;
	}

	public void setSplitMethod(String splitMethod) {
		this.splitMethod = splitMethod;
	}

	public List<String> getPercent() {
		return percent;
	}

	public void setPercent(List<String> percent) {
		this.percent = percent;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getDeletedBy() {
		return deletedBy;
	}

	public void setDeletedBy(String deletedBy) {
		this.deletedBy = deletedBy;
	}

	public String getEditedBy() {
		return editedBy;
	}

	public void setEditedBy(String editedBy) {
		this.editedBy = editedBy;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getDeletedAt() {
		return deletedAt;
	}

	public void setDeletedAt(Date deletedAt) {
		this.deletedAt = deletedAt;
	}

	public Date getEditedAt() {
		return editedAt;
	}

	public void setEditedAt(Date editedAt) {
		this.editedAt = editedAt;
	}

	public String getPaidBy() {
		return paidBy;
	}

	public void setPaidBy(String paidBy) {
		this.paidBy = paidBy;
	}

	public String getSingleAmount() {
		return singleAmount;
	}

	public void setSingleAmount(String singleAmount) {
		this.singleAmount = singleAmount;
	}

	public String getTransactionGroupID() {
		return transactionGroupID;
	}

	public void setTransactionGroupID(String transactionGroupID) {
		this.transactionGroupID = transactionGroupID;
	} 
	
	
}
