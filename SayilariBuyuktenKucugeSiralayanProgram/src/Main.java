import java.util.Scanner;
public class Main {
    public static void main(String [] args)
    {
        Scanner input=new Scanner(System.in);
        int birinciSayi,ikinciSayi,ucuncuSayi;
        System.out.print("Birinci sayıyı giriniz: ");
        birinciSayi = input.nextInt();
        System.out.print("İkinci sayısı giriniz: ");
        ikinciSayi = input.nextInt();
        System.out.print("Üçüncü sayısı giriniz: ");
        ucuncuSayi = input.nextInt();
        if(birinciSayi>ikinciSayi && birinciSayi>ucuncuSayi)
        {
            if (ikinciSayi > ucuncuSayi)
                System.out.print("birinciSayi> ikinciSayi> ucuncuSayi");
            else if (ucuncuSayi > ikinciSayi)
                System.out.print("birinciSayi> ucuncuSayi> ikinciSayi");
            else if (ikinciSayi == ucuncuSayi)
                System.out.print("birinciSayi> ikinciSayi = ucuncuSayi");
        }
        else if(ikinciSayi>birinciSayi && ikinciSayi>ucuncuSayi)
        {
            if (birinciSayi > ucuncuSayi)
                System.out.print("ikinciSayi> birinciSayi> ucuncuSayi");
            else if (ucuncuSayi > birinciSayi)
                System.out.print("ikinciSayi> ucuncuSayi> birinciSayi");
            else if (birinciSayi == ucuncuSayi)
                System.out.print("ikinciSayi> birinciSayi = ucuncuSayi");
        }
        else if(ucuncuSayi>birinciSayi && ucuncuSayi>ikinciSayi)
        {
            if (birinciSayi > ikinciSayi)
                System.out.print("ucuncuSayi> birinciSayi> ikinciSayi");
            else if (ikinciSayi > birinciSayi)
                System.out.print("ucuncuSayi> ikinciSayi> birinciSayi");
            else if (birinciSayi == ikinciSayi)
                System.out.print("ucuncuSayi> birinciSayi = ikinciSayi");
        }
        else
            System.out.print("birinciSayi = ikinciSayi = ucuncuSayi");
    }
}
