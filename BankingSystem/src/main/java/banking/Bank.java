package banking;

import java.util.LinkedHashMap;
import java.util.Random;


/**
 * Private Variables:<br>
 * {@link #accounts}: List&lt;Long, Account&gt;
 */
public class Bank implements BankInterface {
	private LinkedHashMap<Long, Account> accounts;
	private Random random;
	Long accountNumberGeneration;
	
	

	public Bank() throws Exception {
		accounts=new LinkedHashMap<>();
		random = new Random();
		accountNumberGeneration=new Random().nextLong(1, 10000);
		}
	
	private Account getAccount(Long accountNumber) {
		return accounts.get(accountNumber);
	}
	
	public LinkedHashMap<Long, Account> getAccountDetails()
	{
		return accounts;
	}

	public Long openCommercialAccount(Company company, int pin, double startingDeposit) {
		while(accountNumberGeneration < 10000)
		{
		 accountNumberGeneration++;
          CommercialAccount commercialAccount = new CommercialAccount(company, accountNumberGeneration, pin, startingDeposit);
		  accounts.put(accountNumberGeneration, commercialAccount);
          return accountNumberGeneration;
		}
		return -1L;
	}

	public Long openConsumerAccount(Person person, int pin, double startingDeposit) {
		while(accountNumberGeneration < 10000)
		{
			accountNumberGeneration++;
		ConsumerAccount consumerAcc = new ConsumerAccount(person, accountNumberGeneration, pin, startingDeposit);
		accounts.put(accountNumberGeneration,consumerAcc);
		return accountNumberGeneration;
		}
		return -2L;
	}

	public boolean authenticateUser(Long accountNumber, int pin) {
        return accounts.get(accountNumber).validatePin(pin);
	}

	public double getBalance(Long accountNumber) {
		return accounts.get(accountNumber).getBalance();
	}

	public void credit(Long accountNumber, double amount) {
		accounts.get(accountNumber).creditAccount(amount);
	}

	public boolean debit(Long accountNumber, double amount) {
        return accounts.get(accountNumber).debitAccount(amount);
	}
}
