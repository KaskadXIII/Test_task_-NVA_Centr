public class CashBackDebitCard extends DebitCard{
    public CashBackDebitCard(double balance){
        super(balance);
    }

    private double cashBack;
    private double balance;


    @Override
    public void topUp(double sum) {
        balance += sum;
        System.out.println("��� ������ ��������� ����� �������� ��: " + sum);
    }

    @Override
    public boolean pay(double sum) {
        if (balance >= sum){
            if (sum >=  5000){
                cashBack = sum * 0.05;
                System.out.println("��� ����� �������� ������ �� �����: " + cashBack);
            }
            balance -= sum;
            System.out.println("������ �� �����: " + sum);
            return true;
        }
        else {
            System.out.println("�� ���������� ������� ��� ��������, ������� ������: " + balance);
            return false;
        }
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public String getAllBalance(){
        return "������ �� ����� ��������� �����: " + balance + "\n���������� ������: " + cashBack;
    }
}
