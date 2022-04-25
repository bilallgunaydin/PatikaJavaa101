import java.util.Scanner;

public class Main {

    static int power(int base, int power)
    {
        int result;
        if(power==0)
            result=1;
        else
        result = power(base, power-1) * base;

        return result;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int base, power;
        System.out.print("Bir sayı giriniz: ");
        base = input.nextInt();
        System.out.print("Hesaplanmasını istediğiniz kuvveti giriniz: ");
        power = input.nextInt();

        System.out.println("Sonuc: "+power(base,power));

    }
}
