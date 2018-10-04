public class BankAccount {
	private double balance;
	private int accountID;
	private String password;

	public BankAccount(int StartAccountID, double startBalance, String startPassword) {
		accountID = StartAccountID;
		balance = startBalance;
		password = startPassword;
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
		return getAccountID() + "\t" + getBalance();
	} 

	public boolean deposit(double amount){
		if (amount < 0) {
			return false;
		}
		balance += amount;
		return true;
	} 
  
	public boolean withdraw(double amount){
		if ((amount < 0) || (amount > balance)) {
			return false;
		}
		balance = balance - amount;
		return true;
	}

}