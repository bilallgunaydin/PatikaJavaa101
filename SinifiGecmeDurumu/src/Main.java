import java.util.Scanner;
public class Main {
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        int matematik, fizik, turkce, kimya, muzik, dersSayac=0, toplamNot = 0;
        double ortalama=0;
        System.out.print("Lütfen Matematik notunuzu giriniz: ");
        matematik=input.nextInt();
        System.out.print("Lütfen Fizik notunuzu giriniz: ");
        fizik=input.nextInt();
        System.out.print("Lütfen Türkçe notunuzu giriniz: ");
        turkce=input.nextInt();
        System.out.print("Lütfen Kimya notunuzu giriniz: ");
        kimya=input.nextInt();
        System.out.print("Lütfen Müzik notunuzu giriniz: ");
        muzik=input.nextInt();
        if(matematik>=0 && matematik<=100) {
            toplamNot = toplamNot + matematik;
            dersSayac++;
        }
        if(fizik>=0 && fizik<=100) {
            toplamNot = toplamNot + fizik;
            dersSayac++;
        }
        if(turkce>=0 && turkce<=100) {
            toplamNot = toplamNot + turkce;
            dersSayac++;
        }
        if(muzik>=0 && muzik<=100) {
            toplamNot = toplamNot + muzik;
            dersSayac++;
        }
        if(kimya>=0 && kimya<=100) {
            toplamNot = toplamNot + kimya;
            dersSayac++;
        }
        if(dersSayac==0)
            ortalama=0;
        else
            ortalama=toplamNot/dersSayac;

        if(ortalama<55)
        {
            System.out.println("Sınıfta kaldınız, seneye tekrar görüşmek üzere!");
            System.out.println("Ortalamanız: "+ortalama);
        }
        else
        {
            System.out.println("Tebrikler, sınıfı geçtiniz!");
            System.out.println("Ortalamanız: "+ortalama);
        }

    }
}
