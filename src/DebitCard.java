public class DebitCard extends BankCard{
    public DebitCard(double balance){
        super(balance);
    }

    private double balance;

    @Override
    public void topUp(double sum) {
        balance += sum;
        System.out.println("��� ������ ��������� ����� �������� ��: " + sum);
    }

    @Override
    public boolean pay(double sum) {
        if (balance >= sum){
            balance -= sum;
            System.out.println("������ �� �����: " + sum);
            System.out.println("������� ������: " + balance);
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
        return "������ �� ����� ��������� �����: " + balance;
    }
}
