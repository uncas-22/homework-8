public class Main {
    public static void main(String[] args) {
        System.out.println("Урок 8. Задание 1.1");
        double bankTotal = 0; // вклад в банке
        int monthSum = 15_000; // ежемесячное пополнение
        double percent = 1.01;
        int monthNumber = 1;
        while (bankTotal <= 2_459_000) {
            bankTotal = bankTotal * percent;
            bankTotal = bankTotal + monthSum;
            monthNumber++;
            System.out.println("Месяц " + monthNumber + " cумма накоплений равна " + bankTotal);
        }
        System.out.println();
        System.out.println("Итого потребуется " + monthNumber + " месяцев чтобы накопить " + bankTotal);
        System.out.println();

        System.out.println("Урок 8. Задание 1.2");// вывести последовательность чисел через for и while
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        int t = 10;
        while (t >=1) {
            System.out.print(t + " ");
            t --;
        }
        System.out.println();
        System.out.println();
        System.out.println("Урок 8. Задание 1.3"); //
        int population = 12_000_000;
        int birthRate = 17 * population / 1000;
        int mortality = 8 * population / 1000;
        for (int d = 1; d <= 10; d ++) {
            population += birthRate;
            population -= mortality;
            System.out.println("Год " + d + ", численность населения составляет " + population + " человек");
        }
        System.out.println();
        System.out.println("Урок 8. Задание 2.1 надо накопить 12_000_000 руб.");
        int bankTotalTAsk = 15_000; // вклад в банке
        int monthNumberTask = 1;
        while (bankTotalTAsk <= 12_000_000) {
            bankTotalTAsk *= 1.07;
            monthNumberTask ++;
            System.out.println("Месяц " + monthNumberTask + " cумма накоплений равна " + bankTotalTAsk);
        }
        System.out.printf("ИТОГО %d месяцев для накопления суммы %d руб.\n", monthNumberTask, bankTotalTAsk);

        System.out.println();
        System.out.println("Урок 8. Задание 2.2 вывод в консоль только каждого 6 месяца");
        int bankTotalTAsk2 = 15_000; // вклад в банке
        int monthNumberTask2 = 1;
        while (bankTotalTAsk2 <= 12_000_000) {
            bankTotalTAsk2 *= 1.07;
            if (monthNumberTask2 % 6 == 0) {
                System.out.println("Месяц " + monthNumberTask2 + " cумма накоплений равна " + bankTotalTAsk2);
            }
            monthNumberTask2++;
        }
        System.out.printf("ИТОГО %d месяцев для накопления суммы %d руб.\n", monthNumberTask2, bankTotalTAsk2);

        System.out.println();
        System.out.println("Урок 8. Задание 2.3");
        int bank = 15_000; // вклад в банке
        for (int months = 1; months <= 108; months ++) {
            bank *= 1.07;
            if (months % 6 == 0) {
                System.out.println("Месяц " + months + " cумма накоплений равна " + bank);
            }
        }
        System.out.println();
        System.out.println("Урок 8. Задание 2.4");// отчет по пятницам
        int firstFriday = 2;
        for (int currentFriday = firstFriday; currentFriday <=31; currentFriday += 7) {
            System.out.println("Сегодня пятница, " + currentFriday + "-е число. Необходимо подготовить отчет");
        }
        System.out.println();
        System.out.println("Урок 8. Задание 3.5"); // комета через 79 лет
        int currentYear = 2022;
        int beginning = currentYear - 200;
        int ending = currentYear + 100;
        for (int n = beginning; n < ending; ++n) {
            if (n % 79 == 0) {
                System.out.println(n);
            }
        }
        System.out.println();
        System.out.println("Урок 8. Задание 3.6"); // таблица умножения на 2
        for (int p = 1; p <= 10; p++) {
            System.out.println("2 * " + p + " = " + 2 * p);
        }
    }
}
   