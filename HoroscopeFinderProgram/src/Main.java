import java.util.Scanner;
public class Main {
    public static void main(String [] args)
    {
        Scanner input =new Scanner(System.in);
        int month, day;
        String horoscope="";
        boolean isError=false;
        System.out.print("Enter the month you were born: ");
        month=input.nextInt();
        System.out.print("Enter the day you were born: ");
        day=input.nextInt();

        switch (month)
        {
            case 1:
                if (day >= 1 && day <= 31)
                {
                    if (day <= 21)
                        horoscope="Capricorn";
                    else
                        horoscope="Aquarius";
                }

                break;

            case 2:
                if (day >= 1 && day <= 28)
                {
                    if (day <= 19)
                        horoscope="Aquarius";
                    else
                        horoscope="Pisces";
                }

                break;

            case 3:
                if (day >= 1 && day <= 31)
                {
                    if (day <= 20)
                        horoscope="Pisces";
                    else
                        horoscope="Aries";
                }

                break;

            case 4:
                if (day >= 1 && day <= 30)
                {
                    if (day <= 20)
                        horoscope="Aries";
                    else
                        horoscope="Taurus";
                }
                break;

            case 5:
                if (day >= 1 && day <= 31) {
                    if (day <= 21)
                        horoscope="Taurus";
                    else
                        horoscope="Gemini";
                }

                break;

            case 6:
                if (day >= 1 && day <= 30) {
                    if (day <= 22)
                        horoscope="Gemini";
                    else
                        horoscope="Cancer";
                }
                break;

            case 7:
                if (day >= 1 && day <= 31) {
                    if (day <= 22)
                        horoscope="Cancer";
                    else
                        horoscope="Leo";
                }
                break;

            case 8:
                if (day >= 1 && day <= 31) {
                    if (day <= 22)
                        horoscope="Leo";
                    else
                        horoscope="Virgo";
                }
                break;

            case 9:
                if (day >= 1 && day <= 30) {
                    if (day <= 22)
                        horoscope="Virgo";
                    else
                        horoscope="Libra";
                }
                break;

            case 10:
                if (day >= 1 && day <= 31) {
                    if (day <= 22)
                        horoscope="Libra";
                    else
                        horoscope="Scorpio";
                }
                break;

            case 11:
                if (day >= 1 && day <= 30) {
                    if (day <= 21)
                        horoscope="Scorpio";
                    else
                        horoscope="Sagittarius";
                }
                break;

            case 12:
                if (day >= 1 && day <= 31) {
                    if (day <= 21)
                        horoscope="Sagittarius";
                    else
                        horoscope="Capricorn";
                }
                break;

                default:
                    isError=true;
        }
        if(isError)
            System.out.println("You made an incorrect entry, try again.");
        else
            System.out.print("Your horoscope is: "+horoscope);
    }
}
