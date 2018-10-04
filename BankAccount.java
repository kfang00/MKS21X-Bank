public class BankAccount {
	private double balance;
	private int accountID;
	private String password;

	public BankAccount(int accountID, double balance, String password) {
		accountID = accountID;
		balance = balance;
		password = password;
	} 

	public double getBalance(){
		return balance;
	} 
	public int getAccountID(){
		return accountID;
	} 

 	public void setPassword(String newPass){
		password = newPass;
	} 

	public String toString(){
		return accountID + "\t" + balance;
	} 

	public boolean deposit(double amount){
	
	} 
  
	public boolean withdraw(double amount){
	
	}

}