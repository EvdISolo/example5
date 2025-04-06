import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Выберите операцию и введите её номер");

        int ernings = 0; // Доходы
        int spendings = 0; //Расходы


        Scanner scanner = new Scanner(System.in);


        while (true) {
            System.out.println("1.Добавить новый доход");
            System.out.println("2.Добавить новый расход");
            System.out.println("3.Выбрать систему налогообложения");

            String input = scanner.nextLine();
            if ("end".equals(input)) {
                break;
            }
            int operation = Integer.parseInt(input);
            switch (operation) {
                case 1:
                    System.out.println("Введите сумму дохода");

                    String moneyStr = scanner.nextLine();
                    int money = Integer.parseInt(moneyStr);
                    ernings += money;
                    break;
                case 2:
                    System.out.println("Введите сумму расхода ");
                    String moneyAgi = scanner.nextLine();
                    int nomoney = Integer.parseInt(moneyAgi);
                    spendings -= nomoney;
                    break;

                case 3:
                    int p1 = Usn6.taxEarningsPlusSpending(ernings, spendings);
                    int p2 = Usn6.taxEarningsMinusSpending(ernings, spendings);
                    if (p1 < p2) {
                        int p3 = p2 - p1;
                        System.out.println("Cоветуем выбрать УСН Доходы \n Ваш налог составит " + p1 + "\n Налог на другой системе составит " + p2 + " Вам получиться сэкономить " + p3);

                    } else if (p1 == p2) {
                        System.out.println("Можете выбрать любую систему налогообложения");
                    } else if (p1 > p2) {
                        int p4 = p1 - p2;
                        System.out.println("Советуем выбрать УСН Доходы-Расходы" + p2 + " \n Налог на другой системе составит " + p1 + "Вам получиться сэкономить" + p4);
                    }
                    break;
                default:
                    System.out.println("Такой операции нет");
            }


            System.out.println("Программма завершена!");
        }
    }
}







