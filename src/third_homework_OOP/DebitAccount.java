package third_homework_OOP;

public class DebitAccount extends Account {
    public DebitAccount(String accountNumber, Double accountBalance, User user, Bank bank) {
        super(accountNumber, accountBalance, user, bank);
    }

    @Override
    public void withdraw(Double amount) {
        System.out.println("You will get money without any commission: " + amount);
    }

    @Override
    public String toString() {
        return "DebitAccount{" +
                "accountNumber='" + getAccountNumber() + '\'' +
                ", accountBalance=" + getAccountBalance() +
                ", user=" + getUser() +
                ", bank=" + getBank() +
                '}';
    }
}

