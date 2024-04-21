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
        System.out.print("Введите число из меню: ");
        while (console.hasNext()) {
            try {
                int input = console.nextInt();
                if (input == 1) {
                    System.out.println("Укажите сумму для пополнения баланса дебетовой карты: ");
                    sum = console.nextDouble();
                    debitCard.topUp(sum);
                    System.out.print("\nВведите число из меню: ");
                } else if (input == 2) {
                    System.out.println("Укажите сумму для оплаты дебетовой карты: ");
                    sum = console.nextDouble();
                    debitCard.pay(sum);
                    System.out.print("\nВведите число из меню: ");
                } else if (input == 3) {
                    System.out.println(debitCard.getBalance());
                    System.out.print("\nВведите число из меню: ");
                } else if (input == 4) {
                    System.out.println("Укажите сумму для пополнения баланса кредитной карты: ");
                    sum = console.nextDouble();
                    creditCard.topUp(sum);
                    System.out.print("\nВведите число из меню: ");
                } else if (input == 5) {
                    System.out.println("Укажите сумму для оплаты кредитной картой: ");
                    sum = console.nextDouble();
                    creditCard.pay(sum);
                    System.out.print("\nВведите число из меню: ");
                } else if (input == 6) {
                    System.out.println(creditCard.getCreditBalance());
                    System.out.print("\nВведите число из меню: ");
                } else if (input == 7) {
                    System.out.println("Укажите сумму для пополнения баланса дебетовой карты + бонус 1%: ");
                    sum = console.nextDouble();
                    bonusDebitCard.topUp(sum);
                    System.out.print("\nВведите число из меню: ");
                } else if (input == 8) {
                    System.out.println("Укажите сумму для оплаты дебетовой карты + бонус 1%: ");
                    sum = console.nextDouble();
                    bonusDebitCard.pay(sum);
                    System.out.print("\nВведите число из меню: ");
                } else if (input == 9) {
                    System.out.println(bonusDebitCard.getAllBalance());
                    System.out.print("\nВведите число из меню: ");
                } else if (input == 10) {
                    System.out.println("Укажите сумму для пополнения баланса кредитной карты + бонус 1%: ");
                    sum = console.nextDouble();
                    bonusCreditCard.topUp(sum);
                    System.out.print("\nВведите число из меню: ");
                } else if (input == 11) {
                    System.out.println("Укажите сумму для оплаты кредитной картой + бонус 1%: ");
                    sum = console.nextDouble();
                    bonusCreditCard.pay(sum);
                    System.out.print("\nВведите число из меню: ");
                } else if (input == 12) {
                    System.out.println(bonusCreditCard.getAllBalance());
                    System.out.print("\nВведите число из меню: ");
                } else if (input == 13) {
                    System.out.println("Укажите сумму для пополнения баланса дебетовой карты + кэшбэк 5%: ");
                    sum = console.nextDouble();
                    cashBackDebitCard.topUp(sum);
                    System.out.print("\nВведите число из меню: ");
                } else if (input == 14) {
                    System.out.println("Укажите сумму для оплаты дебетовой карты + кэшбэк 5%: ");
                    sum = console.nextDouble();
                    cashBackDebitCard.pay(sum);
                    System.out.print("\nВведите число из меню: ");
                } else if (input == 15) {
                    System.out.println(cashBackDebitCard.getAllBalance());
                    System.out.print("\nВведите число из меню: ");
                } else if (input == 16) {
                    System.out.println("Укажите сумму для пополнения баланса кредитной карты + кэшбэк 5%: ");
                    sum = console.nextDouble();
                    cashBackCreditCard.topUp(sum);
                    System.out.print("\nВведите число из меню: ");
                } else if (input == 17) {
                    System.out.println("Укажите сумму для оплаты кредитной картой + кэшбэк 5%: ");
                    sum = console.nextDouble();
                    cashBackCreditCard.pay(sum);
                    System.out.print("\nВведите число из меню: ");
                } else if (input == 18) {
                    System.out.println(cashBackCreditCard.getAllBalance());
                    System.out.print("\nВведите число из меню: ");
                } else if (input == 19) {
                    System.out.println("Укажите сумму для пополнения баланса дебетовой карты + накопления в размере 0.005%: ");
                    sum = console.nextDouble();
                    savingsDebitCard.topUp(sum);
                    System.out.print("\nВведите число из меню: ");
                } else if (input == 20) {
                    System.out.println("Укажите сумму для оплаты дебетовой карты + накопления в размере 0.005%: ");
                    sum = console.nextDouble();
                    savingsDebitCard.pay(sum);
                    System.out.print("\nВведите число из меню: ");
                } else if (input == 21) {
                    System.out.println(savingsDebitCard.getAllBalance());
                    System.out.print("\nВведите число из меню: ");
                } else if (input == 22) {
                    System.out.println("Укажите сумму для пополнения баланса кредитной карты + накопления в размере 0.005%: ");
                    sum = console.nextDouble();
                    savingsCreditCard.topUp(sum);
                    System.out.print("\nВведите число из меню: ");
                } else if (input == 23) {
                    System.out.println("Укажите сумму для оплаты кредитной картой + накопления в размере 0.005%: ");
                    sum = console.nextDouble();
                    savingsCreditCard.pay(sum);
                    System.out.print("\nВведите число из меню: ");
                } else if (input == 24) {
                    System.out.println(savingsCreditCard.getAllBalance());
                    System.out.print("\nВведите число из меню: ");
                } else if (input == 99) {
                    menu();
                    System.out.print("\nВведите число из меню: ");
                } else if (input == 0) {
                    System.out.println("Работа программы закончена. Всего доброго.");
                    break;
                } else {
                    System.out.println("Такой команды не существует, повторите попытку.");
                    System.out.print("\nВведите число из меню: ");
                }
            } catch (InputMismatchException e) {
                System.out.println("Введён неверный символ, введите цифры от 1 до 24");
                console = new Scanner(System.in);
            }
        }
    }

    private static void menu() {
        System.out.println("Для выбора дальнейших Вам действий введите необходимую команду в консоль:");
        System.out.println("1. Внести сумму на дебетовую карту.");
        System.out.println("2. Произвести оплату дебетовой картой.");
        System.out.println("3. Узнать баланс дебетовой карты.");

        System.out.println("4. Внести сумму на кредитную карту.");
        System.out.println("5. Произвести оплату кредитной картой.");
        System.out.println("6. Узнать баланс кредитной карты.");

        System.out.println("7. Внести сумму на дебетовую карту + бонус 1%.");
        System.out.println("8. Произвести оплату дебетовой картой + бонус 1%.");
        System.out.println("9. Узнать баланс дебетовой карты + бонус 1%.");

        System.out.println("10. Внести сумму на кредитную карту + бонус 1%.");
        System.out.println("11. Произвести оплату кредитной картой + бонус 1%.");
        System.out.println("12. Узнать баланс кредитной карты + бонус 1%.");

        System.out.println("13. Внести сумму на дебетовую карту + кэшбэк 5%.");
        System.out.println("14. Произвести оплату дебетовой картой + кэшбэк 5%.");
        System.out.println("15. Узнать баланс дебетовой карты + кэшбэк 5%.");

        System.out.println("16. Внести сумму на кредитную карту + кэшбэк 5%.");
        System.out.println("17. Произвести оплату кредитной картой + кэшбэк 5%.");
        System.out.println("18. Узнать баланс кредитной карты + кэшбэк 5%.");

        System.out.println("19. Внести сумму на дебетовую карту + накопления в размере 0.005%.");
        System.out.println("20. Произвести оплату дебетовой картой + накопления в размере 0.005%.");
        System.out.println("21. Узнать баланс дебетовой карты + накопления в размере 0.005%.");

        System.out.println("22. Внести сумму на кредитную карту + накопления в размере 0.005%.");
        System.out.println("23. Произвести оплату кредитной картой + накопления в размере 0.005%.");
        System.out.println("24. Узнать баланс кредитной карты + накопления в размере 0.005%.");
        System.out.println("25. ");

        System.out.println("Для повторного вызова меню - 99");
        System.out.println("Для выхода нажмите - 0\n");
    }
}