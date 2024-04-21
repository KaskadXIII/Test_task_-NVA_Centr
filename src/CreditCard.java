public class CreditCard extends BankCard {
    public CreditCard(double balance) {
        super(balance);
    }

    private final double creditLimit = 10000.0;
    private double creditBalance = 10000.0;
    private double balance;

    @Override
    public void topUp(double sum) {
        if (creditBalance < creditLimit) {
            double diff = creditLimit - creditBalance;
            if (sum <= diff) {
                creditBalance += sum;
                System.out.println("����� ��������� ����� ��������� ��: " + sum);
            }
            if (sum > diff) {
                creditBalance += diff;
                balance += (sum - diff);
                System.out.println("����� ��������� ����� ��������� ��: " + diff);
                System.out.println("����� ��������� ����� ��������� ��: " + (sum - diff));

            }
            System.out.println(getAllBalance());
        } else {
            balance += sum;
            System.out.println("����� ��������� ����� ��������� ��: " + sum);
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
        return "����� ��������� ����: " + creditBalance + "\n����� ��������� �����: " + balance;
    }

    public double getCreditBalance() {
        return creditBalance;
    }

}
