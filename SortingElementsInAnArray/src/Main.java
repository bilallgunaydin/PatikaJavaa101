import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[]args)
    {
        Scanner input= new Scanner(System.in);
        System.out.print("Dizinin boyutunu giriniz: ");
        int length=input.nextInt();
        int [] array=new int[length];
        System.out.println("Dizinin elemanlarını giriniz: ");
        for(int i=0; i<length; i++)
        {
            System.out.print(i+1+".elemanı giriniz: ");
            array[i]=input.nextInt();
        }
        Arrays.sort(array);
        for(int i: array)
            System.out.print(i+" ");

    }
}
