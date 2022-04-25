import java.util.Scanner;
public class Main {
    public static void main(String [] args)
    {

        Scanner input=new Scanner(System.in);
        int n,r, factorialN=1, factorialR=1, factorialLast=1, combination;

        System.out.print("N sayısını giriniz: ");
        n=input.nextInt();
        System.out.print("r sayısını giriniz: ");
        r=input.nextInt();

        for(int i=1; i<=n; i++)
        {
            factorialN=factorialN*i;
        }
        for(int i=1; i<=r; i++)
        {
            factorialR=factorialR*i;
        }
        for(int i=1; i<=n-r; i++)
        {
            factorialLast=factorialLast*i;
        }
        combination=factorialN/(factorialR*factorialLast);
        System.out.print("Kombinasyon sonucu: "+combination);



    }
}
