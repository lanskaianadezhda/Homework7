public class Main {
    public static void main(String[] args) {

        //task1
        System.out.println("Задача 1");

        int plannedIncome = 2_459_000;
        int total = 0;
        int income = 15000;
        int mounth = 0;
        while (total <= plannedIncome) {
            total += income;
            total = total + total / 100;
            mounth++;
            System.out.println("Месяц " + mounth + " сумма накоплений равна " + total + " рублей");
        }

        //task2
        System.out.println("Задача 2");

        int number = 0;
        while (number < 10) {
            number++;
            System.out.print(number + " ");
        }
        System.out.println();
        for (; number >= 1; number--) {
            System.out.print(number + " ");
        }
        System.out.println();

        //task3
        System.out.println("Задача 3");

        int population = 12_000_000;
        int i = 1;
        for (; i <= 10; i++) {
            int birthRate = 17 * population / 1000;
            int mortalityRate = 8 * population / 1000;
            population = population + birthRate - mortalityRate;
            System.out.println("Год " + i + " численность населения составляет " + population);
        }

        //task4
        System.out.println("Задача 4");
        int deposit = 15000;
        double monthlyPercent = 0.07;
        int numberMonth = 1;
        while (deposit <= 12_000_000) {
            deposit += deposit * monthlyPercent;
            System.out.printf("Месяц %d, сумма накоплений: %d%n", numberMonth, deposit);
            numberMonth++;
        }

        //task 5
        System.out.println("Задача 5");
        deposit = 15000;
        monthlyPercent = 0.07;
        numberMonth = 1;
        total = 0;
        while (deposit <= 12_000_000) {
            deposit += deposit * monthlyPercent;
            numberMonth++;
            if (numberMonth % 6 == 0) {
                System.out.printf("Месяц %d, сумма накоплений: %d%n", numberMonth, deposit);
            }
        }
        //task 6
        System.out.println("Задача 6");
        deposit = 15000;
        monthlyPercent = 0.07;
        numberMonth = 1;
        int totalNumberMonth = 12 * 9;
        total = 0;
        while (numberMonth < totalNumberMonth) {
            deposit += deposit * monthlyPercent;
            numberMonth++;
            if (numberMonth % 6 == 0) {
                System.out.printf("Месяц %d, сумма накоплений: %d%n", numberMonth, deposit);
            }
        }

        //task 7
        System.out.println("Задача 7");

        int day = 5;
        for (day = 1; day < 31; day += 7) {
            System.out.println("Сегодня пятница, " + day + "-е число. Необходимо подготовить отчет");
        }
        //task 8
        System.out.println("Задача 8");

        int period = 79;
        int cometArrival = 0;
        int currentYear = 2024;
        int start = currentYear - 200;
        int end = currentYear + 100;
        for (int year = cometArrival; year < end; year += period) {
            if (year > start) {
                System.out.println(year);
            }
        }
    }
}