public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");
        for (int i = 1; i<=10; i++) {
            System.out.println(i);
        }

        System.out.println("Task 2");
        for (int i = 10; i>0; i--) {
            System.out.println(i);
        }

        System.out.println("Task 3");
        for (int i = 2; i<=17; i=i+2) {
            System.out.println(i);
        }

        System.out.println("Task 4");
        for (int i = 10; i>=-10; i=i-1) {
            System.out.println(i);
        }

        System.out.println("Task 5");
        for (int i = 1904; i<=2096; i=i+4) {
            System.out.println(i + " год является високосным");
        }
    }
}