import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        int number, total=0; boolean flag=true;
        while(flag)
        {
            System.out.print("Sayı giriniz: ");
            number=input.nextInt();
            if(number%2==1)
                flag=false;
            else
            {
                if(number%4==0 && number>0)
                    total=total+number;
            }
        }
        System.out.print("Sayıların ortalaması: "+total);
    }
}
