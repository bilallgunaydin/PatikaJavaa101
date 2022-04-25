import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.print("Basamak Sayisi: ");
        int number=input.nextInt();
        for (int i = number-1; i>=0 ; i--)
        {
            for (int j = number-i; j >0; j--) {
                System.out.print(" ");
            }
            for (int k = 2*i+1; k >0 ; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}