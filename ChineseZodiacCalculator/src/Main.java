import java.util.Scanner;
public class Main {
    public static void main(String [] args)
    {
        Scanner input=new Scanner(System.in);
        int birthDate, remainder;
        String horoscope="";
        System.out.print("Doğum yılınızı giriniz: ");
        birthDate=input.nextInt();
        remainder=birthDate%12;
        switch (remainder)
        {
            case 0:
                horoscope="Monkey";
                break;
            case 1:
                horoscope="Rooster";
                break;
            case 2:
                horoscope="Dog";
                break;
            case 3:
                horoscope="Pig";
                break;
            case 4:
                horoscope="Mice";
                break;
            case 5:
                horoscope="Ox";
                break;
            case 6:
                horoscope="Tiger";
                break;
            case 7:
                horoscope="Rabbit";
                break;
            case 8:
                horoscope="Dragon";
                break;
            case 9:
                horoscope="Snake";
                break;
            case 10:
                horoscope="Horse";
                break;
            case 11:
                horoscope="Sheep";
                break;

            default:
                System.out.print("Yanlış bir giriş yaptınız. Lütfen tekrar deneyiniz.");
                break;
        }
        System.out.print("Çin Zodyağı Burcunuz: "+horoscope);
    }
}
