package banking;

/**
 * Abstract bank account class.<br>
 * <br>
 *
 * Private Variables:<br>
 * {@link #accountHolder}: AccountHolder<br>
 * {@link #accountNumber}: Long<br>
 * {@link #pin}: int<br>
 * {@link #balance}: double
 */
public abstract class Account extends AccountHolder implements AccountInterface{
	private AccountHolder accountHolder;
	private Long accountNumber;
	private int pin;
	private double startingDeposits;
	private double balance;

	protected Account(AccountHolder accountHolder, Long accountNumber, int pin, double startingDeposit) {
		// complete the constructor
		super(pin);
		this.accountHolder=accountHolder;
		this.accountNumber=accountNumber;
		this.pin=pin;
		this.startingDeposits=startingDeposit;
		this.balance=startingDeposits;
	}

	public AccountHolder getAccountHolder() {
		
        return accountHolder;
	}

	public boolean validatePin(int attemptedPin) {
    if(this.pin == attemptedPin)
    {
    	return true;
    }
    else
    {
    	return false;
    }
		
	}

	public double getBalance() {
		return balance;
	}

	public Long getAccountNumber() {
		return accountNumber;
        // return -1L;
	}

	public void creditAccount(double amount) {
		this.balance=this.balance+amount;
	}

	public boolean debitAccount(double amount) {
       if(Double.compare(this.balance, amount) < 0)
       {
    	   return false;
       }
       else
       {
    	   this.balance=this.balance-amount;
    	   return true;
       }
	}
}
