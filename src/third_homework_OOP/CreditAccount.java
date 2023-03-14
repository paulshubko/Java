import third_homework_OOP.Account;
import third_homework_OOP.Bank;
import third_homework_OOP.User;

import java.util.Date;
package third_homework_OOP;

public class CreditAccount extends Account {
    private Double accountLimit;

    public CreditAccount(String accountNumber, Double accountBalance, User user, Bank bank) {
        super(accountNumber, accountBalance, user, bank);
        if (user.getAge() < 18) {
            this.accountLimit = 0.0;
        } else {
            this.accountLimit = 10000.0;
        }
    }

    public Double getAccountLimit() {
        return accountLimit;
    }

    public void setAccountLimit(Double accountLimit) {
        this.accountLimit = accountLimit;
    }

    @Override
    public void withdraw(Double amount) {
        Double commission = amount * 0.1;
        Double withdrawAmount = amount - commission;
        if (withdrawAmount <= accountBalance + accountLimit) {
            accountBalance -= withdrawAmount;
            System.out.println("Your commission is 10%, you withdraw: " + withdrawAmount);
        } else {
            System.out.println("You don't have enough money!");
        }
    }

    @Override
    public String toString() {
        return "CreditAccount{" +
                "accountLimit=" + accountLimit +
                ", accountNumber='" + accountNumber + '\'' +
                ", accountBalance=" + accountBalance +
                ", user=" + user +
                ", bank=" + bank +
                '}';
    }
}



