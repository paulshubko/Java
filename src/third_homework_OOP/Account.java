package third_homework_OOP;

public class Account {
    private String accountNumber;
    private Double accountBalance;
    private User user;
    private Bank bank;

    public Account(String accountNumber, Double accountBalance, User user, Bank bank) {
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.user = user;
        this.bank = bank;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(Double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    public void withdraw(Double amount) {
        System.out.println("Withdraw method for Account class.");
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNumber='" + accountNumber + '\'' +
                ", accountBalance=" + accountBalance +
                ", user=" + user +
                ", bank=" + bank +
                '}';
    }
}

