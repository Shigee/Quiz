package test;

import dao.AccountDAO;
import model.Account;
import model.Login;
import model.NewAccount;

public class AccountDAOTest {
	public static void main(String[] args){
		testCreateRecord();
		testFindByLogin1();
		testFindByLogin2();

	}

	//レコードの追加テスト
	public static void testCreateRecord(){
		NewAccount na = new NewAccount("UNKO","123456");
		AccountDAO dao = new AccountDAO();
		dao.createRecord(na);
	}

	public static void testFindByLogin1(){
		Login login = new Login("TESTUSER", "12345");
		AccountDAO dao = new AccountDAO();
		Account result = dao.findByLogin(login);
		if(result != null &&
				result.getUserName().equals("TESTUSER")&&
				result.getPass().equals("12345")){
			System.out.println("testFindByLogin1:成功しました");
		}else{
			System.out.println("testFindByLogin1:失敗しました");
		}
	}

	public static void testFindByLogin2(){
		Login login = new Login("TESTUSER", "1234");
		AccountDAO dao = new AccountDAO();
		Account result = dao.findByLogin(login);
		if(result == null){
			System.out.println("testFindByLogin2:成功しました");
		}else{
			System.out.println("testFindByLogin2:失敗しました");
		}
	}
}
