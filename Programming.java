public class Programming {

    // 1. Swap the values of two variables, x and y, without needing a third
    // variable.

    public static void main(String[] args) {

        int a = 5;
        int b = 3;

        switchVariables(a, b);
        System.out.println(reverseNumber(12345));

    }

    public Programming() {

    }

    public static void switchVariables(int a, int b) {

        System.out.println("Before: " + a);
        System.out.println("Before: " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println(a);
        System.out.println(b);

    }

    public static int reverseNumber(int number) {

        int reversedNumber = 0;

        while (number > 0) {
            reversedNumber = reversedNumber * 10 + number % 10;
            number = number / 10;
        }

        return reversedNumber;

    }

    public static int reverseNumbers(int number) {

        return 0;
    }

}