public class BonusDebitCard extends DebitCard{
    public BonusDebitCard(double balance){
        super(balance);
    }

    private double bonus;
    private double balance;


    @Override
    public void topUp(double sum) {
        balance += sum;
        System.out.println("Ваш баланс дебетовой карты пополнен на: " + sum);
    }

    @Override
    public boolean pay(double sum) {
        if (balance >= sum){
            balance -= sum;
            bonus = sum * 0.01;
            System.out.println("Оплата на сумму: " + sum);
            System.out.println("Начислена сумма бонусными баллами: " + bonus);
            return true;
        }
        else {
            System.out.println("Не достаточно средств для списания, текущий баланс: " + balance);
            return false;
        }
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public String getAllBalance(){
        return "Баланс на Вашей дебетовой карте: " + balance + "\nСумма бонусных баллов: " + bonus;
    }
}
