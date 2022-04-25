import java.util.Scanner;
public class Main {
    public static void main(String [] args)
    {
        Scanner input=new Scanner(System.in);
        int distance, age,selectType; double normalAmount;
        System.out.print("Mesafeyi km türünden giriniz : ");
        distance=input.nextInt();
        System.out.print("Yaşınızı giriniz : ");
        age=input.nextInt();
        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): ");
        selectType=input.nextInt();

        if(distance<0 || age<0 || (selectType!=1 && selectType!=2))
            System.out.print("Hatalı Veri Girdiniz! Lütfen tekrar deneyiniz.");
        else
        {
            normalAmount=distance*0.10;
            if(age<12)
                normalAmount-=(normalAmount*0.50);
            else if(age>=12 && age<=24)
                normalAmount-=(normalAmount*0.10);
            else if(age>65)
                normalAmount-=(normalAmount*0.30);

            if(selectType==2)
                normalAmount=(normalAmount-(normalAmount * 0.20))*2;

            System.out.print("Toplam Tutar: "+normalAmount+" TL");
        }
    }
}
