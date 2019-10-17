
public class Account {
	private String accountName;
	private double amount;

	public Account () {
	}

	public Account (String name, double money) {
		accountName = name;
		amount = money;
	}

	public synchronized double deposit(double money) {
		if (money > 0.0) {
                  libHilos.hacerTiem(1,1000);
			amount += money;
                  libHilos.hacerTiem(1,1000);
			return amount;
		} else {
			return -1.0;
		}
	}

	public synchronized double withdraw(double money) {
		if (money > 0.0) {
                        if (amount >= money) {
                        libHilos.hacerTiem(1,1000);
				amount -= money;
                        libHilos.hacerTiem(1,1000);
				return amount;
			} else {
				return -1.0;
			}
		} else {
			return -1.0;
		}
	}

	public synchronized double getBalance() {
            libHilos.hacerTiem(1,1000);
		return amount;
	}

	public synchronized String getName () {
		return accountName;
	}

	public synchronized void print() {
		System.out.println("Account " + getName() + 
            " has $"+ getBalance() + " balance.");
	}

} // Account

