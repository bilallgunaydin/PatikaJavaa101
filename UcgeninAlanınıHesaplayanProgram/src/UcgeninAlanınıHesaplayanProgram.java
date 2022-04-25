import java.util.Scanner;
public class UcgeninAlanınıHesaplayanProgram {
    public static void main(String[] args) {
        double kenar1,kenar2,kenar3;
        Scanner input=new Scanner(System.in);
        System.out.print("1.Kenarı Giriniz : ");
        kenar1 = input.nextDouble();
        System.out.print("2.Kenarı Giriniz : ");
        kenar2 = input.nextDouble();
        System.out.print("3.Kenarı Giriniz : ");
        kenar3 = input.nextDouble();

        double u=(kenar1+kenar2+kenar3)/2;
        double alan= Math.sqrt(u * (u - kenar1) * (u - kenar2) * (u - kenar3));
        System.out.println("Üçgenin alanı = " + alan);
    }
}
