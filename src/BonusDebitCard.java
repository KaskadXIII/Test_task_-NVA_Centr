public class BonusDebitCard extends DebitCard{
    public BonusDebitCard(double balance){
        super(balance);
    }

    private double bonus;
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
            bonus = sum * 0.01;
            System.out.println("������ �� �����: " + sum);
            System.out.println("��������� ����� ��������� �������: " + bonus);
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
        return "������ �� ����� ��������� �����: " + balance + "\n����� �������� ������: " + bonus;
    }
}
