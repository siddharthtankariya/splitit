/**
 * 
 */
package com.splitt.functionality;

import com.splitt.bo.TransactionsBO;
import com.splitt.bo.UserBO;

/**
 * @author Siddharth Tankariya
 *
 *         First Draft
 */
public class UserFunctions {
	private final static String PAID_BY_YOU_AND_SPLIT_EQUALLY = "paidbyyouandsplitequally";
	private final static String YOU_OWE = "youowefullamount";
	private final static String THEY_OWE = "theyowefullamount";
	private final static String PAID_BY_THEM_AND_SPLIT_EQUALLY = "paidbythemandsplitequally";

	public void addUserTransaction(TransactionsBO transaction) {

		UserBO p1 = transaction.getPerson1();
		UserBO p2 = transaction.getPerson2();
			if (PAID_BY_YOU_AND_SPLIT_EQUALLY.equals(transaction.getOwelent())) {
				splitEqually(p1, p2, Double.parseDouble(transaction.getAmount()));
			} else if (PAID_BY_THEM_AND_SPLIT_EQUALLY.equals(transaction.getOwelent())) {
				splitEqually(p2, p1, Double.parseDouble(transaction.getAmount()));
			} else if (YOU_OWE.equals(transaction.getOwelent())) {
				splitOwe(p1, Double.parseDouble(transaction.getAmount()));
			} else if (THEY_OWE.equals(transaction.getOwelent())) {
				splitOwe(p2, Double.parseDouble(transaction.getAmount()));
			}
			// Update P1 and P2 in DB
	}

	private void splitEqually(UserBO p1, UserBO p2, double amount) {
		p1.setBalance(p1.getBalance() + amount / 2);
		p2.setBalance(p2.getBalance() + amount / 2);
	}

	private void splitOwe(UserBO p1, double amount) {
		p1.setBalance(p1.getBalance() + amount);
	}

	public void editUserTransaction(TransactionsBO transaction) {

	}

	public void deleteTransaction(TransactionsBO transaction) {

	}
}
