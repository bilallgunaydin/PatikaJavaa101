import java.util.Scanner;

public class Main {
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("n1 sayısını giriniz: ");
        int n1=input.nextInt();

        System.out.print("n2 sayısını giriniz: ");
        int n2=input.nextInt();

        int ebob=1, ekok=1;

        if(n1>n2)
        {
            int i=1;
            while(n1>=i)
            {
                if(n1%i==0 && n2%i==0)
                 ebob=i;

                i++;
            }
        }
        else if(n1<n2)
        {
            int i=1;
            while(n2>=i)
            {
                if(n1%i==0 && n2%i==0)
                    ebob=i;

                i++;
            }
        }
        else
        ebob=n1;

        System.out.println("Girdiğiniz sayıların En Büyük Ortak Böleni: "+ebob);
        ekok=(n1*n2)/ebob;
        System.out.print("Girdiğiniz sayıların En Küçük Ortak Katı: "+ekok);
    }
}
