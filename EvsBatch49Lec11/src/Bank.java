
public class Bank {

	private int amount;
	private int deposit;
	private int withdraw;

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		if (amount <= 0)
			throw new IllegalArgumentException("zero or negitive values can not be stored");
		this.amount = amount;
	}

	public int getDeposit() {
		return deposit;
	}

	public void setDeposit(int deposit) {
		if (deposit <= 0)
			throw new IllegalArgumentException("deposit can not be zero or negative");
		this.deposit = deposit;
	}

	public int getWithdraw() {
		return withdraw;
	}

	public void setWithdraw(int withdraw) {
		if (withdraw > amount && withdraw <= 0)
			throw new IllegalArgumentException("withdraw amount can not be exceed from actual balance");
		this.withdraw = withdraw;
	}

	public void deposit() {
		amount += deposit;
	}

	public void withdraw() {
		amount -= withdraw;
	}

      public void withdraw(int haircut) {
		amount -= (withdraw + haircut);
	}

}
