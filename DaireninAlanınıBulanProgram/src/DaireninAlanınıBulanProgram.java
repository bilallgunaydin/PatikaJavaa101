import java.util.Scanner;
public class DaireninAlanınıBulanProgram {
    public static void main(String [] args)
    {
        double pi=3.14; int merkezAcısınınOlcusu; double alan; int yariCap;
        Scanner input = new Scanner(System.in);
        System.out.print("Dairenin yarı çapını giriniz: ");
        yariCap=input.nextInt();
        System.out.print("Dairenin merkez açısının ölçüsünü giriniz: ");
        merkezAcısınınOlcusu=input.nextInt();
        alan=(pi*(yariCap*yariCap)*merkezAcısınınOlcusu)/360;
        System.out.println("Daire diliminin alanının ölçüsü: "+alan);
    }
}
