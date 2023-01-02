package banking;

import java.util.ArrayList;
import java.util.List;

/**
 * Account implementation for commercial (business) customers.<br><br>
 *
 * Private Variables:<br>
 * {@link #authorizedUsers}: List&lt;Person&gt;<br>
 */
public class CommercialAccount  {
	private List<Person> authorizedUsers;
	public Long accountNumber;
	public int pin;
	public double startingDeposits;
	

	public CommercialAccount(Company company, Long accountNumber, int pin, double startingDeposit) {
		authorizedUsers=new ArrayList<>();
		this.accountNumber=accountNumber;
		this.pin=pin;
		this.startingDeposits=startingDeposit;
		
	}

	/**
	 * @param person The authorized user to add to the account.
	 */
	protected void addAuthorizedUser(Person person) {
		authorizedUsers.add(person);
	}

	/**
	 * @param person
	 * @return true if person matches an authorized user in {@link #authorizedUsers}; otherwise, false.
	 */
	public boolean isAuthorizedUser(Person person) {
		return authorizedUsers.contains(person);
       
	}
}
