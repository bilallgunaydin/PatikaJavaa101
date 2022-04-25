import java.sql.SQLOutput;
import java.util.Scanner;
public class KdvTutarıHesaplayanProgram {
    public static void main(String []args)
    {
        double money;
        System.out.print("Kdv tutarı bulunması gereken ürün fiyatını giriniz: ");
        Scanner input=new Scanner(System.in);
        money=input.nextDouble();
        boolean result=(money>=0 || money<=1000) || money>1000;
        double kdvResult=(result)? (money*18/100) : (money*8/100);
        System.out.println("Ürünün KDV'li fiyatı: "+(kdvResult+money));
        System.out.println("Ürünün KDV fiyatı: "+kdvResult);
    }
}
