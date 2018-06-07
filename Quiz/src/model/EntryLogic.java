package model;

import dao.AccountDAO;

public class EntryLogic {

	public boolean execute(NewAccount NewAccount){
		AccountDAO dao = new AccountDAO();
		Account account = dao.createRecord(NewAccount);
		return account != null;
	}
}
