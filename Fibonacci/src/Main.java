import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        int num1=0, num2=1, num3, n;
        System.out.print("Elaman sayısını giriniz: ");
        n=input.nextInt();
        System.out.print(num1+" "+num2);
        for (int i=2; i<=n; i++)
        {
            num3=num1+num2;
            System.out.print(" "+num3);
            num1=num2;
            num2=num3;
        }
    }
}
