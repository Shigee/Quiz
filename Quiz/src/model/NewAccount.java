package model;

public class NewAccount {
	private String userName;
	private String pass;

	public NewAccount(String userName, String pass){
		this.userName = userName;
		this.pass = pass;
	}
	public String getUserName(){return userName;}
	public String getPass(){return pass;}
}
