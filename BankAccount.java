public class BankAccount {
	private double balance;
	private int accountID;
	private String password;

	public BankAccount(double startBalance, int startAccountID, String startPassword) {
		accountID = startAccountID;
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
	
	private boolean authenticate(String checkPass) {
		return checkPass == password;
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
	
	public boolean transferTo(BankAccount other, double amount, String password) {
		if (this.authenticate(password)) {
			if (this.withdraw(amount)) {
				other.deposit(amount);
				return true;
			}
			return false;
		}
		return false;
			
	}
}
