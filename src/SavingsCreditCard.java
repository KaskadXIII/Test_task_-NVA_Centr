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
                System.out.println("����� ��������� ����� ��������� ��: " + sum);
                savings = sum * 0.005 / 100;
                System.out.println("��� ������ ��������� ����� �������� ��: " + sum);
                System.out.println("���������� �� �����: " + savings);

            }
            if (sum > diff) {
                creditBalance += diff;
                balance += (sum - diff);
                System.out.println("����� ��������� ����� ��������� ��: " + diff);
                System.out.println("����� ��������� ����� ��������� ��: " + (sum - diff));
                savings = sum * 0.005 / 100;
                System.out.println("��� ������ ��������� ����� �������� ��: " + sum);
                System.out.println("���������� �� �����: " + savings);
            }
            System.out.println(getAllBalance());
        } else {
            balance += sum;
            savings = sum * 0.005 / 100;
            System.out.println("����� ��������� ����� �����������, ��������� ��������� ����� ��: " + sum);
            System.out.println("���������� �� �����: " + savings);
        }
    }

    @Override
    public boolean pay(double sum) {
        if (balance > sum) {
            balance -= sum;
            System.out.println("������ �� �����: " + sum);
            System.out.println(getAllBalance());
            return true;
        } else if (balance < sum && sum <= (balance + creditBalance)) {
            double diff = sum - balance;
            balance = 0;
            creditBalance -= diff;
            System.out.println("������ �� �����: " + sum);
            System.out.println("� ��������� ����� �������: " + (sum - diff));
            System.out.println("� ��������� ����� �������: " + (diff));
            System.out.println(getAllBalance());
            return true;
        } else if (balance + creditLimit < sum) {
            System.out.println("������������ �������, �������� �� ��������.");
            System.out.println(getAllBalance());
            return false;
        } else {
            System.out.println("������������ �������, �������� �� ��������.");
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
        return "����� ��������� ����: " + creditBalance + "\n����� ��������� �����: " + balance +
                "\n����� ����������: " + savings;
    }

    public double getCreditBalance() {
        return creditBalance;
    }
}
