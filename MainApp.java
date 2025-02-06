import java.util.Scanner;


class Employee{
    String name;
    double salary;

    public Employee(String name, double salary){
        this.name=name;
        this.salary=salary;
    }

    public void displayDetatails(){ 
        System.out.println("Employee's name is  " +name);
        System.out.println("Employee's salary is  " +salary);

    } 
}
class SalaryCalculator{

    public double calculateBonus(double salary){
        double bonus =0.1*salary;
        return bonus;
    }
}

public class MainApp {

    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the Employee name ");
    String name =sc.nextLine();

    System.out.println("Enter the Employee salary ");
    double salary =sc.nextDouble();

    Employee employee= new Employee(name, salary);

    SalaryCalculator calculator = new SalaryCalculator();
    double bonus =calculator.calculateBonus(salary); 

    //display results
    System.out.println("\n Employee Details ");
    employee.displayDetatails();

    System.out.println("the Bonus is "+bonus);

    sc.close();

    }   
}
