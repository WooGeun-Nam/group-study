package prob03;

public class Money {
	private int amount;

	public Money(int amount) {
		this.amount = amount;
	}

	public Object add(Money money) {
		Money m = new Money(0);
		m.amount = this.amount + money.amount;
		return m;
	}

	public Object multiply(Money money) {
		Money m = new Money(0);
		m.amount = this.amount * money.amount;
		return m;
	}

	public Object minus(Money money) {
		Money m = new Money(0);
		m.amount = this.amount - money.amount;
		return m;
	}

	public Money devide(Money money) {
		Money m = new Money(0);
		m.amount = this.amount/money.amount;
		return m;
	}


	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Money) {
			return this.amount==((Money) obj).amount;
		}
		return false;
		
	}
	
	/* 코드 작성 */
	
	
}
