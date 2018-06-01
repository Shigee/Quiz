package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Account;
import model.Login;

public class AccountDAO {
	public Account findByLogin(Login login){
		Connection conn = null;
		Account account = null;
		try{
			Class.forName("org.h2.Driver");
			conn = DriverManager.getConnection("jdbc:h2:~/test","sa","");

			String sql = "SELECT USER_NAME, PASS, SCORE FROM ACCOUNT WHERE USER_NAME = ? AND PASS = ?";
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
}
