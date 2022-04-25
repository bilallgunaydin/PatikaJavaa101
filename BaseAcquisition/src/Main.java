import java.util.Scanner;
public class Main {
    public static void main(String [] args)
    {
        Scanner input= new Scanner(System.in);
        int total=1, number, base;
        System.out.print("Üssünün alınmasını istediğiniz sayıyı giriniz: ");
        number=input.nextInt();
        System.out.print("Sayının alınacak üs sayısını giriniz:  ");
        base=input.nextInt();
        for (int i=0; i<base; i++)
        {
            total=total*number;
        }
        System.out.print("Sonuç: "+total);

    }
}
