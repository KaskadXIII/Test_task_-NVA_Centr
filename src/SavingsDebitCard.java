public class SavingsDebitCard extends DebitCard {
    public SavingsDebitCard(double balance) {
        super(balance);
    }

    private double savings;
    private double balance;


    @Override
    public void topUp(double sum) {
        balance += sum;
        savings = sum * 0.005 / 100;
        System.out.println("Ваш баланс дебетовой карты пополнен на: " + sum);
        System.out.println("Накопления на сумму: " + savings);
    }

    @Override
    public boolean pay(double sum) {
        if (balance >= sum) {
            balance -= sum;
            System.out.println("Оплата на сумму: " + sum);
            return true;
        } else {
            System.out.println("Не достаточно средств для списания, текущий баланс: " + balance);
            return false;
        }
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public String getAllBalance() {
        return "Баланс на Вашей дебетовой карте: " + balance + "\nСумма накоплений: " + savings;
    }
}
