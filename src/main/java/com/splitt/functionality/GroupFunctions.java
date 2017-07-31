/**
 * 
 */
package com.splitt.functionality;

import java.util.List;

import com.splitt.bo.TransactionGroupBO;
import com.splitt.bo.UserBO;

/**
 * @author Siddharth Tankariya
 *
 *         First Draft
 */
public class GroupFunctions {
	private static final String EQUAL = "equal";
	private static final String UNEQUAL = "unequal";
	
	public void addGroupExpense(TransactionGroupBO transaction) {

		List<UserBO> involved = transaction.getPersons();
		List<String> amount = transaction.getAmount();
		if (EQUAL.equals(transaction.getSplitMethod())) {
			splitEqually(involved, transaction.getSingleAmount());
			//update balance in mongo for user balance
		}else if(UNEQUAL.equals(transaction.getSplitMethod())){
			splitUnequally(involved,amount);
		}
	}

	/**
	 * @param involved
	 * @param amount
	 */
	private void splitUnequally(List<UserBO> involved, List<String> amount) {
		// TODO Auto-generated method stub
		int i = 0;
		for(UserBO user : involved) {
			user.setBalance(user.getBalance()+Double.parseDouble(amount.get(i)));
		}
	}

	/**
	 * @param involved
	 * @param amount
	 */
	private void splitEqually(List<UserBO> involved, String amount) {
		// TODO Auto-generated method stub
		int share = involved.size();
		for(UserBO user : involved) {
			user.setBalance(user.getBalance()+(Double.parseDouble(amount)/share));
		}
	}
}
