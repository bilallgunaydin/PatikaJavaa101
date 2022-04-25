import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int number=input.nextInt();
        int total=0;
        for (int i=1; i<number; i++)
        {
            if(number%i==0)
                total+=i;
        }
        if(total==number)
            System.out.print(number+" Mükemmel sayıdır.");
        else
            System.out.print(number+" Mükemmel sayı değildir.");
    }
}
