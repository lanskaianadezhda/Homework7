public class Main {
    public static void main(String[] args) {

        //task1
        System.out.println("Задача 1");

        int plannedIncome = 2_459_000;
        int total = 0;
        int income = 15000;
        int mounth = 0;
        while (total <= plannedIncome) {
            total = total + income;
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
        for  (; number >= 1; number--) {
            System.out.print(number + " ");
        }

        //task3
        System.out.println("Задача 3");

        int population = 12_000_000;
        int birthRate = 17;
        int mortalityRate = 8;
        int currentYear = 2024;
        for (int year = currentYear; year < currentYear + 10; year++); {

        }
    }
}