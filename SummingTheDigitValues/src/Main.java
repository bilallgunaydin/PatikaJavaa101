import java.util.Scanner;

public class Main {
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        int number, numberStep,total=0;
        System.out.print("Sayı giriniz: ");
        number=input.nextInt();
        while(number!=0)
        {
            numberStep=number%10;
            total+=numberStep;
            number/=10;
        }
        System.out.print("Girdiğiniz sayının basamak değerlerinin toplamı: "+total);

    }
}
