import java.util.Scanner;
public class Main {
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        int heat;
        System.out.print("Sıcaklık Giriniz: ");
        heat=input.nextInt();
        if (heat<5)
            System.out.println("Kayak yapabilirsiniz");
        else if (heat>=5 && heat<=15)
            System.out.println("Sinemaya gidebilirsiniz.");
        else if (heat>=15 && heat<=25)
            System.out.println("Piknige gidebilirsiniz.");
        else if(heat>25)
            System.out.println("Yuzmeye gidebilirsiniz");
    }
}
