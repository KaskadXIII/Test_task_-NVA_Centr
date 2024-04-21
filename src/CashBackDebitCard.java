public class CashBackDebitCard extends DebitCard{
    public CashBackDebitCard(double balance){
        super(balance);
    }

    private double cashBack;
    private double balance;


    @Override
    public void topUp(double sum) {
        balance += sum;
        System.out.println("Ваш баланс дебетовой карты пополнен на: " + sum);
    }

    @Override
    public boolean pay(double sum) {
        if (balance >= sum){
            if (sum >=  5000){
                cashBack = sum * 0.05;
                System.out.println("Вам будет начислен кэшбэк на сумму: " + cashBack);
            }
            balance -= sum;
            System.out.println("Оплата на сумму: " + sum);
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
        return "Баланс на Вашей дебетовой карте: " + balance + "\nРасчитаный кэшбэк: " + cashBack;
    }
}
