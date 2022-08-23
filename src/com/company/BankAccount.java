package com.company;

public class BankAccount {
    private Double amount;

    public Double getAmount() {
        return amount;
    }

    public void deposit(double sum) {
        amount = getAmount() + sum;
    }

    public void withDraw(Integer sum) throws LimitException {
        amount = getAmount() - sum;
        if (sum > getAmount()){
            throw new LimitException("Ошибка. На вашем счету недостадочно средств для снятия денег " +
                    "На счету: " + getAmount());
        }
    }
}
