import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int number = input.nextInt();
        int[] list = {5,6123,34,12,-3};
        Arrays.sort(list);
        int min = list[0];
        int max = list[list.length - 1];

        for(int i = 0; i < list.length;i++)
            if(list[i] < number)
                min = list[i];


        for(int i = list.length - 1; i > 0;i--)
            if(list[i] > number)
                max = list[i];


        System.out.println("Girilen sayıya en yakın küçük sayı: "+ min);
        System.out.println("Girilen sayıya en yakın büyük sayı: "+ max);

    }
}
