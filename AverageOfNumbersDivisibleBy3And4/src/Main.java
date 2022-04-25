import java.util.Scanner;
public class Main {
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        int number, total=0, sayac=0; double average;
        System.out.print("Sayı giriniz: ");
        number=input.nextInt();
        for (int i=1; i<=number; i++)
            if(i%12==0)
            {
                total+=i;
                sayac++;
            }
        average=total / count;
        System.out.print("Ortalama: "+average);
    }
}
