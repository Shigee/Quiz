package model;

import dao.AccountDAO;

public class EntryLogic {

	public boolean execute(NewAccount NewAccount){
		AccountDAO dao = new AccountDAO();
		boolean result =dao.createRecord(NewAccount);
		return result;
	}
}
