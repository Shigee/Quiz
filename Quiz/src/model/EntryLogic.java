package model;

import dao.AccountDAO;

public class EntryLogic {

	public boolean execute(NewAccount NewAccount){
		String name = NewAccount.getUserName();
		String pass = NewAccount.getPass();

		//名前とパスワードのどちらかが空白の場合falseを返す(リダイレクト)
		if(name.isEmpty() || pass.isEmpty()){
			boolean result = false;
			return result;
		}else{
			AccountDAO dao = new AccountDAO();
			boolean result = dao.createRecord(NewAccount);
			return result;
		}
	}
}
