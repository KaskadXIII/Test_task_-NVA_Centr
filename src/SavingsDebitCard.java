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
        System.out.println("��� ������ ��������� ����� �������� ��: " + sum);
        System.out.println("���������� �� �����: " + savings);
    }

    @Override
    public boolean pay(double sum) {
        if (balance >= sum) {
            balance -= sum;
            System.out.println("������ �� �����: " + sum);
            return true;
        } else {
            System.out.println("�� ���������� ������� ��� ��������, ������� ������: " + balance);
            return false;
        }
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public String getAllBalance() {
        return "������ �� ����� ��������� �����: " + balance + "\n����� ����������: " + savings;
    }
}
