public class Driver {
	public static void main(String[]args) {
		BankAccount a = new BankAccount(10024, 2352.50, "heyheyhey");
		if(a.withdraw(1000000) ){
             		System.out.println("Withdrawal success!");
       		}
		else{
            		System.out.println("Withdrawal failure");
		}
		if(a.deposit(100) ){
             		System.out.println("Deposit success!");
       		}
		else{
            		System.out.println("Deposit failure");
		}
		System.out.println(a.toString());
	}
}