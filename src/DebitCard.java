public class DebitCard extends BankCard{
    public DebitCard(double balance){
        super(balance);
    }

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
            System.out.println("Оплата на сумму: " + sum);
            System.out.println("Текущий баланс: " + balance);
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
        return "Баланс на Вашей дебетовой карте: " + balance;
    }
}
