import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        System.out.print("Bir sayı giriniz : ");
        number = scanner.nextInt();

        System.out.print("Çıktısı :");
        recursiveIsVeryFun(number, number, true);

    }

    public static void recursiveIsVeryFun(int n, int temp, boolean check) {
        System.out.print(" " + temp);
        if(temp <= 0)
            check = false;

        int newNumber = check ? temp - 5 : temp + 5;
        if(newNumber <= n) {
            recursiveIsVeryFun(n, newNumber, check);
        }
    }
}