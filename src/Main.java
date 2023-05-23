import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1 ();
        task2 ();
        task3 ();
        task4 ();
    }
    public static void task1 (){
        System.out.println("Задача1");
        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        double[] a = {1.57, 7.654, 9.986};
        int[] apples = new int[5];

    }
    public static void task2 () {
        System.out.println("Задача2");
        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        System.out.print(numbers[0] + ", ");
        System.out.print(numbers[1] + ", ");
        System.out.println(numbers[2]);
        double[] a = {1.57, 7.654, 9.986};
            System.out.print(a[0] + ", ");
            System.out.print(a[1] + ", ");
            System.out.println(a[2]);
        int[] apples = new int[5];
        apples[0] = 2;
        apples[1] = 5;
        apples[2] = 1;
        for (int i = 0; i < 5; i++) {
            System.out.print(apples[i] + ", ");
        }
        System.out.println();
    }
    public static void task3 () {
        System.out.println("Задача3");
        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        System.out.print(numbers[2] + ", ");
        System.out.print(numbers[1] + ", ");
        System.out.println(numbers[0]);
        double[] a = {1.57, 7.654, 9.986};
        System.out.print(a[2] + ", ");
        System.out.print(a[1] + ", ");
        System.out.println(a[0]);
        int[] apples = new int[5];
        apples[0] = 2;
        apples[1] = 5;
        apples[2] = 1;
        for (int i = 4; i >= 0; i--) {
            System.out.print(apples[i] + ", ");
        }
        System.out.println();
    }
    public static void task4 () {
        System.out.println("Задача4");
        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 1) {
                numbers[i] += 1;
            }
        }
        System.out.println(Arrays.toString(numbers));
    }
}