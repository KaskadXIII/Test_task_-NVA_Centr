public class SavingsCreditCard extends CreditCard {
    public SavingsCreditCard(double balance) {
        super(balance);
    }

    private final double creditLimit = 10000.0;
    private double creditBalance = 10000.0;
    private double balance;
    private double savings;

    @Override
    public void topUp(double sum) {
        if (creditBalance < creditLimit) {
            double diff = creditLimit - creditBalance;
            if (sum <= diff) {
                creditBalance += sum;
                System.out.println("Сумма кредитной карты пополнена на: " + sum);
                savings = sum * 0.005 / 100;
                System.out.println("Ваш баланс дебетовой карты пополнен на: " + sum);
                System.out.println("Накопления на сумму: " + savings);

            }
            if (sum > diff) {
                creditBalance += diff;
                balance += (sum - diff);
                System.out.println("Сумма кредитной карты пополнена на: " + diff);
                System.out.println("Сумма дебитовой карты пополнена на: " + (sum - diff));
                savings = sum * 0.005 / 100;
                System.out.println("Ваш баланс дебетовой карты пополнен на: " + sum);
                System.out.println("Накопления на сумму: " + savings);
            }
            System.out.println(getAllBalance());
        } else {
            balance += sum;
            savings = sum * 0.005 / 100;
            System.out.println("Сумма кредитной карты максимальна, пополнена дебетовая карта на: " + sum);
            System.out.println("Накопления на сумму: " + savings);
        }
    }

    @Override
    public boolean pay(double sum) {
        if (balance > sum) {
            balance -= sum;
            System.out.println("Оплата на сумму: " + sum);
            System.out.println(getAllBalance());
            return true;
        } else if (balance < sum && sum <= (balance + creditBalance)) {
            double diff = sum - balance;
            balance = 0;
            creditBalance -= diff;
            System.out.println("Оплата на сумму: " + sum);
            System.out.println("С дебитовой карты списано: " + (sum - diff));
            System.out.println("С кредитной карты списано: " + (diff));
            System.out.println(getAllBalance());
            return true;
        } else if (balance + creditLimit < sum) {
            System.out.println("Недостаточко средств, списание не возможно.");
            System.out.println(getAllBalance());
            return false;
        } else {
            System.out.println("Недостаточко средств, списание не возможно.");
            System.out.println(getAllBalance());
            return false;
        }
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public String getAllBalance() {
        return "Сумма кредитной кары: " + creditBalance + "\nСумма дебитовой карты: " + balance +
                "\nСумма накоплений: " + savings;
    }

    public double getCreditBalance() {
        return creditBalance;
    }
}
