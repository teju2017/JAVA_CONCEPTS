package banking;

/**
 *
 * Private Variables:<br>
 * {@link #accountNumber}: Long<br>
 * {@link #bank}: Bank<br>
 */
public class Transaction extends Bank implements TransactionInterface{
	private Long accountNumber;
	private Bank bank;
	private int attemptedPin;
	

	/**
	 *
	 * @param bank
	 *            The bank where the account is housed.
	 * @param accountNumber
	 *            The customer's account number.
	 * @param attemptedPin
	 *            The PIN entered by the customer.
	 * @throws Exception
	 *             Account validation failed.
	 */
	public Transaction(Bank bank, Long accountNumber, int attemptedPin) throws Exception {
		// complete the function
		super();
		this.attemptedPin=attemptedPin;
		this.bank=bank;
		this.accountNumber=accountNumber;
		if(!bank.authenticateUser(accountNumber, attemptedPin))
		{
			throw new Exception();
		}
		
	}

	public double getBalance() {
		// complete the function
		 return bank.getBalance(accountNumber);
        
        
	}

	public void credit(double amount) {
		// complete the function
		bank.credit(accountNumber, amount);
		
	}

	public boolean debit(double amount) {
		if(Double.compare(bank.getBalance(accountNumber), amount) < 0)
		{
			
			return false;
		}
		bank.debit(accountNumber, amount);
		return true;
		
        
	}
}
