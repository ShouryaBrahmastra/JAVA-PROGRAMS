class WithdrawalNotPossible extends Exception {
    private int x, y;

    WithdrawalNotPossible(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "Cannot withdraw Rupees " + this.x + ", account balance is Rupees " + this.y;
    }
}

class MaxPermissibleCreditReached extends Exception {
    private int x, y;

    MaxPermissibleCreditReached(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "Cannot withdraw Rupees " + this.x + ", Max permissible credit for this account is " + this.y;
    }
}

class SavingsAccount {
    private int id;
    String name;
    String address;
    int panNumber, balance;

    SavingsAccount(int id, String name, String address, int panNumber, int balance) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.panNumber = panNumber;
        this.balance = balance;
    }

    void update(String name, String address, int panNumber) {
        this.name = name;
        this.address = address;
        this.panNumber = panNumber;
    }

    public String toString() {
        return ("ID: " + this.id + ", Name: " + this.name + ", Address: " + this.address + ", PAN Number: "
                + this.panNumber + ", Balance: " + this.balance + ", Account type: Savings");
    }

    void withdraw(int amount) {
        try {
            if (amount > this.balance) {
                throw new WithdrawalNotPossible(amount, this.balance);
            }
            this.balance -= amount;
            System.out.println("Withdrawal of Rupees " + amount + " successful!");
        } catch (WithdrawalNotPossible e) {
            System.out.println(e);
        }
    }

    void deposit(int amount) {
        this.balance += amount;
    }
}

class HomeLoanAccount {
    private int id;
    String name;
    String address;
    int panNumber, balance, maxPermissibleCredit;

    HomeLoanAccount(int id, String name, String address, int panNumber, int balance, int maxPermissibleCredit) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.panNumber = panNumber;
        this.balance = balance;
        this.maxPermissibleCredit = maxPermissibleCredit;
    }

    void update(String name, String address, int panNumber) {
        this.name = name;
        this.address = address;
        this.panNumber = panNumber;
    }

    public String toString() {
        return ("ID: " + this.id + ", Name: " + this.name + ", Address: " + this.address + ", PAN Number:"
                + this.panNumber + ", Balance: " + this.balance + ", Account type: Home Loan");
    }

    void withdraw(int amount) {
        try {
            if (amount > this.balance + this.maxPermissibleCredit) {
                throw new MaxPermissibleCreditReached(amount, this.balance);
            }
            this.balance -= amount;
            System.out.println("Withdrawal of Rupees " + amount + " successful!");
        } catch (MaxPermissibleCreditReached e) {
            System.out.println(e);
        }
    }

    void deposit(int amount) {
        this.balance += amount;
    }
}

class DematAccount {
    private int id;
    String name;
    String address;
    int panNumber, balance;

    DematAccount(int id, String name, String address, int panNumber, int balance) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.panNumber = panNumber;
        this.balance = balance;
    }

    void update(String name, String address, int panNumber) {
        this.name = name;
        this.address = address;
        this.panNumber = panNumber;
    }

    public String toString() {
        return ("ID: " + this.id + ", Name: " + this.name + ", Address: " + this.address + ", PAN Number:"
                + this.panNumber + ", Balance: " + this.balance + ", Account type: Demat");
    }

    void withdraw(int amount) {
        try {
            if (amount > this.balance) {
                throw new WithdrawalNotPossible(amount, this.balance);
            }
            this.balance -= amount;
            System.out.println("Withdrawal of Rupees " + amount + " successful!");
        } catch (WithdrawalNotPossible e) {
            System.out.println(e);
        }
    }

    void deposit(int amount) {
        this.balance += amount;
    }
}

public class BankAccount {
    public static void main(String[] args) {
        SavingsAccount acc1 = new SavingsAccount(128, "Shourya Gupta", "Kolkata", 54612, 5000);
        acc1.withdraw(7000);
        acc1.deposit(4000);
        acc1.withdraw(6000);
        System.out.println(acc1);
        HomeLoanAccount acc2 = new HomeLoanAccount(129, "Yash Gupta", "Kolkata", 56721, 3000, 50000);
        acc2.withdraw(7000);
        acc2.deposit(5000);
        acc2.withdraw(6000);
        System.out.println(acc2);
    }
}