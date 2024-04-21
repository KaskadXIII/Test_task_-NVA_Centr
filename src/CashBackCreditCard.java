public class CashBackCreditCard extends CreditCard {
    public CashBackCreditCard(double balance) {
        super(balance);
    }

    private final double creditLimit = 10000.0;
    private double creditBalance = 10000.0;
    private double balance;
    private double cashBack;

    @Override
    public void topUp(double sum) {
        if (creditBalance < creditLimit) {
            double diff = creditLimit - creditBalance;
            if (sum <= diff) {
                creditBalance += sum;
                System.out.println("Сумма кредитной карты пополнена на: " + sum);
            }
            if (sum > diff) {
                creditBalance += diff;
                balance += (sum - diff);
                System.out.println("Сумма кредитной карты пополнена на: " + diff);
                System.out.println("Сумма дебитовой карты пополнена на: " + (sum - diff));

            }
            System.out.println(getAllBalance());
        }
    }

    @Override
    public boolean pay(double sum) {
        if (balance > sum) {
            if (sum >= 5000) {
                cashBack = sum * 0.05;
                System.out.println("Вам будет начислен кэшбэк на сумму: " + cashBack);
            }
            balance -= sum;
            System.out.println("Оплата на сумму: " + sum);
            System.out.println(getAllBalance());
            return true;
        } else if (balance < sum && sum <= (balance + creditBalance)) {
            if (sum >= 5000) {
                cashBack = sum * 0.05;
                System.out.println("Вам будет начислен кэшбэк на сумму: " + cashBack);
            }
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
                "\nРасчитаный кэшбэк: " + cashBack;
    }

    public double getCreditBalance() {
        return creditBalance;
    }
}
