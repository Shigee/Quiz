package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Account;
import model.Login;
import model.NewAccount;

public class AccountDAO {

	//ACCOUNT内のレコードを探索
	public Account findByLogin(Login login){
		Connection conn = null;
		Account account = null;

		//データベースに接続
		try{
			Class.forName("org.h2.Driver");
			conn = DriverManager.getConnection("jdbc:h2:~/test","sa","");

			//データの取得(SELECT)
			String sql = "SELECT USER_NAME, PASS, SCORE FROM ACCOUNT WHERE USER_NAME = ? AND PASS = ?";
			//SQLの送信
			PreparedStatement pSmt = conn.prepareStatement(sql);
			pSmt.setString(1, login.getUserName());
			pSmt.setString(2, login.getPass());

			ResultSet rs = pSmt.executeQuery();

			if(rs.next()){
				String userName = rs.getString("USER_NAME");
				String pass = rs.getString("PASS");
				int score = rs.getInt("SCORE");

				account = new Account(userName, pass, score);
			}
		}catch(SQLException e){
			e.printStackTrace();
			return null;
		}catch(ClassNotFoundException e){
			e.printStackTrace();
			return null;
		}finally{
			if(conn != null){
				try{
					conn.close();
				}catch(SQLException e){
				e.printStackTrace();
				return null;
				}
			}
		}
		return account;
	}

	//ACCOUNTに新たなユーザーを追加(失敗ナウw)
	public Account createRecord(NewAccount newAccount){
		Connection conn = null;
		Account account = null;

		//データベースに接続
		try{
			Class.forName("org.h2.Driver");
			conn = DriverManager.getConnection("jdbc:h2:~/test","sa","");
			//オートコミットをオフ
			conn.setAutoCommit(false);

			//データの追加(INSERT)
			String sql = "INSERT INTO ACCOUNT(USER_NAME, PASS) VALUES(?, ?)";
			//SQLの送信
			PreparedStatement pSmt = conn.prepareStatement(sql);
			pSmt.setString(1, newAccount.getUserName());
			pSmt.setString(2, newAccount.getPass());
			pSmt.execute();
			//コミット
            conn.commit();

		}catch(SQLException e){
			e.printStackTrace();
			return null;
		}catch(ClassNotFoundException e){
			e.printStackTrace();
			return null;
		}finally{
			if(conn != null){
				try{
					conn.close();
				}catch(SQLException e){
				e.printStackTrace();
				return null;
				}
			}
		}
		return account;
	}
}
