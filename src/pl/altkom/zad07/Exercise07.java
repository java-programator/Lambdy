package pl.altkom.zad07;

/*
Napisz funkcję, który policzy sumę liczb Fibonacciego mniejszych od 100.

Dodaj do programu, aby liczył sumę ich kwadratów
Dodaj do programu, aby liczył sumę ich sześcianów

Popraw program, aby liczył sumę liczb pierwszych mniejszych od 100
 */

public class Exercise07 {

    private static int fibonacci(int n) {
        if (n<=1) return n;
        else return fibonacci(n-1) + fibonacci(n-2);
    }

    public static int countSum() {
        int sum = 0;
        for (int i = 0; fibonacci(i) <= 100; i++) {
            System.out.println(fibonacci(i));
            sum += fibonacci(i);
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(countSum());
    }
}
