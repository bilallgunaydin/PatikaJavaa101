import java.util.Scanner;

public class Main {
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz: ");
        int count=input.nextInt();
        int max=0, min=0;
        for(int i=1; i<=count; i++)
        {
            System.out.print(i+".Sayıyı giriniz:");
            int number=input.nextInt();
            if(i==1)
            {
                max=number;
                min=number;
            }
            if(min>number)
                min=number;
            else if(max<number)
                max=number;
        }
        System.out.println("En büyük sayı: "+max);
        System.out.print("En küçük sayı: "+min);

    }
}
