import java.util.Scanner;

public class Main {

    static boolean prime(int number, int i) {
        if (number == 2)
            return true;
         else if (number % i == 0)
            return false;
        else if (i*i > number)
            return true;

        return prime(number, i + 1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;

        System.out.print("Bir sayı giriniz: ");
        number = input.nextInt();

        if (prime(number, 2)) {
            System.out.println(number + " asal sayıdır.");
        } else {
            System.out.println(number + " asal sayı değildir.");
        }
    }

}