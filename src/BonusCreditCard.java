public class BonusCreditCard extends CreditCard{
    public BonusCreditCard(double balance){
        super(balance);
    }

    private final double creditLimit = 10000.0;
    private double creditBalance = 10000.0;
    private double balance;
    private double bonus;

    @Override
    public void topUp(double sum) {
        if (creditBalance < creditLimit){
            double diff = creditLimit - creditBalance;
            if (sum <= diff){
                creditBalance += sum;
                System.out.println("Сумма кредитной карты пополнена на: " + sum);
            }
            if (sum > diff){
                creditBalance += diff;
                balance += (sum-diff);
                System.out.println("Сумма кредитной карты пополнена на: " + diff);
                System.out.println("Сумма дебитовой карты пополнена на: " + (sum-diff));

            }
            System.out.println(getAllBalance());
        }else {
            balance += sum;
            System.out.println("Сумма кредитной карты пополнена на: " + sum);
        }
    }

    @Override
    public boolean pay(double sum) {
        if (balance > sum){
            balance -= sum;
            bonus = sum * 0.01;
            System.out.println("Оплата на сумму: " + sum);
            System.out.println(getAllBalance());
            return true;
        } else if (balance < sum && sum <= (balance + creditBalance)) {
            double diff = sum - balance;
            balance = 0;
            creditBalance -= diff;
            bonus = sum * 0.01;
            System.out.println("Оплата на сумму: " + sum);
            System.out.println("С дебитовой карты списано: " + (sum-diff));
            System.out.println("С кредитной карты списано: " + (diff));
            System.out.println(getAllBalance());
            return true;
        } else if (balance + creditLimit < sum) {
            System.out.println("Недостаточко средств, списание не возможно.");
            System.out.println(getAllBalance());
            return false;
        } else{
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
        return  "Сумма кредитной кары: " + creditBalance + "\nСумма дебитовой карты: " + balance  +
                "\nСумма бонусных баллов: " + bonus;
    }

    public double getCreditBalance(){
        return creditBalance;
    }
}
