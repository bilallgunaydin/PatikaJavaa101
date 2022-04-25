import java.util.Scanner;
public class Main {
    public static void main(String [] args)
    {
        int number;
        Scanner input =new Scanner(System.in);

        System.out.print("Sayı giriniz: ");
        number=input.nextInt();
        for (int i=1, j=1; i<=number && j<=number; i*=4, j*=5){
                System.out.println(i);
                System.out.println(j);
        }
    }
}
