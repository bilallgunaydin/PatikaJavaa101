import java.util.Scanner;
public class VucutKitleİndeksiHesaplayanProgram {
    public static void main(String [] args)
    {
        double boy, kilo, vucutKitleIndeksi;
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz: ");
        boy=input.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz: ");
        kilo=input.nextDouble();
        vucutKitleIndeksi=kilo/(boy*boy);
        System.out.print("Vücut Kitle İndeksiniz: "+vucutKitleIndeksi);
    }
}
