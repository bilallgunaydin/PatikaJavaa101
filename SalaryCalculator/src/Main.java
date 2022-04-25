import java.util.Scanner;

public class Main {
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Çalışanın Adını giriniz: ");
        String name=input.nextLine();
        System.out.print("Çalışanın Maaşını giriniz: ");
        double salary=input.nextDouble();
        System.out.print("Çalışanın çalışma saatini giriniz: ");
        int workHours=input.nextInt();
        System.out.print("Çalışanın işe başlama yılınız giriniz: ");
        int hireYear=input.nextInt();
        Employee employee=new Employee(name,salary,workHours,hireYear);
        employee.toStrring();
    }
}
