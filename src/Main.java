public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();
        task11();
        task12();
        task13();
        task14();
    }

    public static void task1() {
        System.out.println("Task 1");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }

    public static void task2() {
        System.out.println("Task 2");
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }
    }

    public static void task3() {
        System.out.println("Task 3");
        for (int i = 2; i <= 17; i = i + 2) {
            System.out.println(i);
        }
    }

    public static void task4() {
        System.out.println("Task 4");
        for (int i = 10; i >= -10; i = i - 1) {
            System.out.println(i);
        }
    }

    public static void task5() {
        System.out.println("Task 5");
        for (int i = 1904; i <= 2096; i = i + 4) {
            System.out.println(i + " год является високосным");
        }
    }

    public static void task6() {
        System.out.println("Task 3");
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.println(i);
        }
    }

    public static void task7() {
        System.out.println("Task 7");
        for (int i = 1; i <= 512; i = i + i) {
            System.out.println(i);
        }
    }

    public static void task8() {
        System.out.println("Task 8");
        int cash = 29000;
        int save = 0;
        for (int i = 0; i < 12; i++) {
            save = save + cash;
            System.out.println("Месяц " + i + ",сумма накоплений равна " + save + " рублей");
        }
    }

    public static void task9() {
        System.out.println("Task 9");
        int cash1 = 29000;
        int save1 = 0;
        for (int i = 0; i < 12; i++) {
            save1 = save1 + cash1 + save1 / 100;
            System.out.println("Месяц " + i + ",сумма накоплений равна " + save1 + " рублей");
        }
    }

    public static void task10() {
        System.out.println("Task 10");
        int two = 2;
        int twoTwo;
        for (int i = 1; i < 11; i++) {
            twoTwo = two * i;
            System.out.println(two + " * " + i + " = " + twoTwo);
        }
    }

    public static void task11() {
        System.out.println("Task 11");
        int month = 0;
        int savings2 = 0;
        int salary2 = 15000;
        while (savings2 <= 2_459_000) {
            month = month + 1;
            savings2 = savings2 + salary2;
            System.out.println("Месяц " + month + " сумма накоплений равна " + savings2 + " рублей");
        }
    }

    public static void task12() {
        System.out.println("Task 12");
        int r = 0;
        while (r < 10) {
            r++;
            System.out.print(r + " ");
        }
        System.out.println(" ");
        for (; r > 0; ) {
            System.out.print(r + " ");
            r--;
        }
        System.out.println(" ");
    }

    public static void task13() {
        System.out.println("Task 13");
        int totalPop = 12_000_000;
        int yearBirth = totalPop / 1000 * 17;
        int yearDeath = totalPop / 1000 * 8;
        int year = 0;
        while (year < 10) {
            year++;
            totalPop = totalPop + yearBirth - yearDeath;
        }
        System.out.println("Год " + year + " численность населения составляет " + totalPop);
    }

    public static void task14() {
        System.out.println("Task 14");
        double savings14 = 15000.00;
        int month14 = 0;
        while (savings14 <= 12_100_000) {
            month14++;
            savings14 = savings14 + savings14 * 0.07;
            if (savings14 > 12_000_000) {
                System.out.println("Месяц " + month14 + " Итого " + savings14);
            }
        }
    }
}