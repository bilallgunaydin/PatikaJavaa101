import java.sql.SQLOutput;
import java.util.Date;

public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;
    double tax;
    double bonus=0;
    Employee(String Name, double Salary, int WorkHours, int HireYear)
    {
        this.name=Name;
        this.salary=Salary;
        this.workHours=WorkHours;
        this.hireYear=HireYear;
    }

    double tax()
    {
        if(this.salary>1000)
            tax = (this.salary * 3 / 100);
        return tax;
    }

    double bonus()
    {
        int differentHour=0;
        if(workHours>40)
         return bonus= differentHour=(workHours-40)*30;

        return differentHour;
    }

    double raiseSalary()
    {
        double salaryy=this.salary;
        int differentYear=2022-this.hireYear;
        if(differentYear<10)
            return salaryy*0.05;
        else if(differentYear>9 && differentYear<20)
            return salaryy*0.10;
        else if(differentYear>19)
            return salaryy*0.15;

        return 0;
    }


    void toStrring()
    {
        System.out.println("Adı: "+name);
        System.out.println("Maaşı: "+salary);
        System.out.println("Çalışma Saati: "+workHours);
        System.out.println("Başlangıç Yılı: "+hireYear);
        System.out.println("Vergi: "+tax());
        System.out.println("Bonus: "+bonus());
        System.out.println("Maaş Artışı: "+raiseSalary());
        System.out.println("Vergi ve Bonuslarla Birlikte maaş: "+(this.salary+(bonus()-tax())));
        System.out.println("Toplam Maaş: "+(this.salary+raiseSalary()+bonus()-tax()));
    }
}
