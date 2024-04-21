import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double cash = 0.0;
        double sum;

        DebitCard debitCard = new DebitCard(cash);
        BonusDebitCard bonusDebitCard = new BonusDebitCard(cash);
        CashBackDebitCard cashBackDebitCard = new CashBackDebitCard(cash);
        SavingsDebitCard savingsDebitCard = new SavingsDebitCard(cash);
        CreditCard creditCard = new CreditCard(cash);
        BonusCreditCard bonusCreditCard = new BonusCreditCard(cash);
        CashBackCreditCard cashBackCreditCard = new CashBackCreditCard(cash);
        SavingsCreditCard savingsCreditCard = new SavingsCreditCard(cash);

        menu();
        System.out.print("������� ����� �� ����: ");
        while (console.hasNext()) {
            try {
                int input = console.nextInt();
                if (input == 1) {
                    System.out.println("������� ����� ��� ���������� ������� ��������� �����: ");
                    sum = console.nextDouble();
                    debitCard.topUp(sum);
                    System.out.print("\n������� ����� �� ����: ");
                } else if (input == 2) {
                    System.out.println("������� ����� ��� ������ ��������� �����: ");
                    sum = console.nextDouble();
                    debitCard.pay(sum);
                    System.out.print("\n������� ����� �� ����: ");
                } else if (input == 3) {
                    System.out.println(debitCard.getBalance());
                    System.out.print("\n������� ����� �� ����: ");
                } else if (input == 4) {
                    System.out.println("������� ����� ��� ���������� ������� ��������� �����: ");
                    sum = console.nextDouble();
                    creditCard.topUp(sum);
                    System.out.print("\n������� ����� �� ����: ");
                } else if (input == 5) {
                    System.out.println("������� ����� ��� ������ ��������� ������: ");
                    sum = console.nextDouble();
                    creditCard.pay(sum);
                    System.out.print("\n������� ����� �� ����: ");
                } else if (input == 6) {
                    System.out.println(creditCard.getCreditBalance());
                    System.out.print("\n������� ����� �� ����: ");
                } else if (input == 7) {
                    System.out.println("������� ����� ��� ���������� ������� ��������� ����� + ����� 1%: ");
                    sum = console.nextDouble();
                    bonusDebitCard.topUp(sum);
                    System.out.print("\n������� ����� �� ����: ");
                } else if (input == 8) {
                    System.out.println("������� ����� ��� ������ ��������� ����� + ����� 1%: ");
                    sum = console.nextDouble();
                    bonusDebitCard.pay(sum);
                    System.out.print("\n������� ����� �� ����: ");
                } else if (input == 9) {
                    System.out.println(bonusDebitCard.getAllBalance());
                    System.out.print("\n������� ����� �� ����: ");
                } else if (input == 10) {
                    System.out.println("������� ����� ��� ���������� ������� ��������� ����� + ����� 1%: ");
                    sum = console.nextDouble();
                    bonusCreditCard.topUp(sum);
                    System.out.print("\n������� ����� �� ����: ");
                } else if (input == 11) {
                    System.out.println("������� ����� ��� ������ ��������� ������ + ����� 1%: ");
                    sum = console.nextDouble();
                    bonusCreditCard.pay(sum);
                    System.out.print("\n������� ����� �� ����: ");
                } else if (input == 12) {
                    System.out.println(bonusCreditCard.getAllBalance());
                    System.out.print("\n������� ����� �� ����: ");
                } else if (input == 13) {
                    System.out.println("������� ����� ��� ���������� ������� ��������� ����� + ������ 5%: ");
                    sum = console.nextDouble();
                    cashBackDebitCard.topUp(sum);
                    System.out.print("\n������� ����� �� ����: ");
                } else if (input == 14) {
                    System.out.println("������� ����� ��� ������ ��������� ����� + ������ 5%: ");
                    sum = console.nextDouble();
                    cashBackDebitCard.pay(sum);
                    System.out.print("\n������� ����� �� ����: ");
                } else if (input == 15) {
                    System.out.println(cashBackDebitCard.getAllBalance());
                    System.out.print("\n������� ����� �� ����: ");
                } else if (input == 16) {
                    System.out.println("������� ����� ��� ���������� ������� ��������� ����� + ������ 5%: ");
                    sum = console.nextDouble();
                    cashBackCreditCard.topUp(sum);
                    System.out.print("\n������� ����� �� ����: ");
                } else if (input == 17) {
                    System.out.println("������� ����� ��� ������ ��������� ������ + ������ 5%: ");
                    sum = console.nextDouble();
                    cashBackCreditCard.pay(sum);
                    System.out.print("\n������� ����� �� ����: ");
                } else if (input == 18) {
                    System.out.println(cashBackCreditCard.getAllBalance());
                    System.out.print("\n������� ����� �� ����: ");
                } else if (input == 19) {
                    System.out.println("������� ����� ��� ���������� ������� ��������� ����� + ���������� � ������� 0.005%: ");
                    sum = console.nextDouble();
                    savingsDebitCard.topUp(sum);
                    System.out.print("\n������� ����� �� ����: ");
                } else if (input == 20) {
                    System.out.println("������� ����� ��� ������ ��������� ����� + ���������� � ������� 0.005%: ");
                    sum = console.nextDouble();
                    savingsDebitCard.pay(sum);
                    System.out.print("\n������� ����� �� ����: ");
                } else if (input == 21) {
                    System.out.println(savingsDebitCard.getAllBalance());
                    System.out.print("\n������� ����� �� ����: ");
                } else if (input == 22) {
                    System.out.println("������� ����� ��� ���������� ������� ��������� ����� + ���������� � ������� 0.005%: ");
                    sum = console.nextDouble();
                    savingsCreditCard.topUp(sum);
                    System.out.print("\n������� ����� �� ����: ");
                } else if (input == 23) {
                    System.out.println("������� ����� ��� ������ ��������� ������ + ���������� � ������� 0.005%: ");
                    sum = console.nextDouble();
                    savingsCreditCard.pay(sum);
                    System.out.print("\n������� ����� �� ����: ");
                } else if (input == 24) {
                    System.out.println(savingsCreditCard.getAllBalance());
                    System.out.print("\n������� ����� �� ����: ");
                } else if (input == 99) {
                    menu();
                    System.out.print("\n������� ����� �� ����: ");
                } else if (input == 0) {
                    System.out.println("������ ��������� ���������. ����� �������.");
                    break;
                } else {
                    System.out.println("����� ������� �� ����������, ��������� �������.");
                    System.out.print("\n������� ����� �� ����: ");
                }
            } catch (InputMismatchException e) {
                System.out.println("����� �������� ������, ������� ����� �� 1 �� 24");
                console = new Scanner(System.in);
            }
        }
    }

    private static void menu() {
        System.out.println("��� ������ ���������� ��� �������� ������� ����������� ������� � �������:");
        System.out.println("1. ������ ����� �� ��������� �����.");
        System.out.println("2. ���������� ������ ��������� ������.");
        System.out.println("3. ������ ������ ��������� �����.");

        System.out.println("4. ������ ����� �� ��������� �����.");
        System.out.println("5. ���������� ������ ��������� ������.");
        System.out.println("6. ������ ������ ��������� �����.");

        System.out.println("7. ������ ����� �� ��������� ����� + ����� 1%.");
        System.out.println("8. ���������� ������ ��������� ������ + ����� 1%.");
        System.out.println("9. ������ ������ ��������� ����� + ����� 1%.");

        System.out.println("10. ������ ����� �� ��������� ����� + ����� 1%.");
        System.out.println("11. ���������� ������ ��������� ������ + ����� 1%.");
        System.out.println("12. ������ ������ ��������� ����� + ����� 1%.");

        System.out.println("13. ������ ����� �� ��������� ����� + ������ 5%.");
        System.out.println("14. ���������� ������ ��������� ������ + ������ 5%.");
        System.out.println("15. ������ ������ ��������� ����� + ������ 5%.");

        System.out.println("16. ������ ����� �� ��������� ����� + ������ 5%.");
        System.out.println("17. ���������� ������ ��������� ������ + ������ 5%.");
        System.out.println("18. ������ ������ ��������� ����� + ������ 5%.");

        System.out.println("19. ������ ����� �� ��������� ����� + ���������� � ������� 0.005%.");
        System.out.println("20. ���������� ������ ��������� ������ + ���������� � ������� 0.005%.");
        System.out.println("21. ������ ������ ��������� ����� + ���������� � ������� 0.005%.");

        System.out.println("22. ������ ����� �� ��������� ����� + ���������� � ������� 0.005%.");
        System.out.println("23. ���������� ������ ��������� ������ + ���������� � ������� 0.005%.");
        System.out.println("24. ������ ������ ��������� ����� + ���������� � ������� 0.005%.");
        System.out.println("25. ");

        System.out.println("��� ���������� ������ ���� - 99");
        System.out.println("��� ������ ������� - 0\n");
    }
}