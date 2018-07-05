package test;

import model.Account;
import model.Login;
import model.LoginLogic;

public class LoginLogicTest {

	public static void main(String[] args) {
		testExecute1();
		testExecute2();
	}

	public static void testExecute1(){
		Login login = new Login("TESTUSER", "12345");
		LoginLogic bo = new LoginLogic();
		Account account = bo.execute(login);
		if(account != null){
			System.out.println("testExecute1:成功");
		}else{
			System.out.println("testExecute1:失敗");
		}
	}

	public static void testExecute2(){
		Login login = new Login("TESTUSER", "1234");
		LoginLogic bo = new LoginLogic();
		Account account = bo.execute(login);
		if(account == null){
			System.out.println("testExecute2:成功");
		}else{
			System.out.println("testExecute2:失敗");
		}
	}
}

