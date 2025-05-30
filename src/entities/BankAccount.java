package entities;

//Bank Account Class:
public class BankAccount {

    //Atributes:
    public int accountID;
    protected String accountType;
    private String owner;
    private double balance;
    private boolean status;

    //Methods:
    public BankAccount(String owner, int accountID, String accountType) {
        setStatus(false);
        setBalance(0);
        if (isStatus() == true) {
            System.out.println("You already have an account");
        } else {
            setStatus(true);
            setOwner(owner);
            setAccountID(accountID);
            setAccountType(accountType);
            switch (getAccountType()) {
                case "CC":
                    setBalance(50.00);
                    break;
                case "CP":
                    setBalance(150.00);
                    break;
            }
        }
    }

    public void closeAccount() {
        if (isStatus() == false) {
            System.out.println("There isn't any account created in your instances");
        } else {
            if (getBalance() > 0) {
                System.out.println("Withdraw all of your funds in the balance, before closing the account.");
            } else if (getBalance() < 0) {
                System.out.println("Pay all of your debits, before closing the account.");
            } else {
                setStatus(false);
                System.out.println("GoodBye! :(");
            }
        }
    }

    public void deposit(double deposit) {
        if (isStatus() == false) {
            System.out.println("There isn't any account created in your instances");
        } else {
            setBalance(deposit);
            System.out.printf("Balance: %.2f.%n", getBalance());
        }
    }

    public void withdraw(double withdraw) {
        if (isStatus() == false) {
            System.out.println("There isn't any account created in your instances");
        } else {
            if (getBalance() >= withdraw) {
                setBalance(getBalance() - withdraw);
                System.out.printf("Balance: %.2f.%n", getBalance());
            } else {
                System.out.println("Your balance is empty.");
            }
        }
    }

    public void bankSubscription () {
        if (isStatus() == false) {
            System.out.println("There isn't any account created in your instances");
        } else {
            switch (getAccountType()){
                case "CC":
                    setBalance(getBalance() - 12.00);
                    break;
                case "CP":
                    setBalance(getBalance() - 20.00);
                    break;
            }
        }
    }

    public String toString () {
        return String.format(

                "----------------------------%nName: %s%nAccount ID: %d%nAccount Type: %s%nBalance: %.2f%nStatus: %s",
                getOwner(), getAccountID(), getAccountType(), getBalance(), isStatus()
        );
    }

    //Acess Methods & Modifiers Methods ("Getters and Setters"):
    public int getAccountID () {
        return this.accountID;
    }
    public void setAccountID (int accountID) {
        this.accountID = accountID;
    }

    public String getAccountType() {
        return this.accountType;
    }
    public void setAccountType (String accountType) {
        this.accountType = accountType;
    }

    public String getOwner() {
        return this.owner;
    }
    public void setOwner(String owner) {
        this.owner = owner;
    }

    public double getBalance() {
        return this.balance;
    }
    public void setBalance (double balance) {
        this.balance = balance;
    }

    public boolean isStatus() {
        return this.status;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }
}
