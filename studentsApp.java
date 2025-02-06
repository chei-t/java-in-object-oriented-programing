import java.util.Scanner;

    
class Student{
    String name;
    double marks;

    public Student(String name, double marks){
        this.name=name;
        this.marks=marks;
    }

    public void displayDetatails(){
        System.out.println("The student name is  "+name);
        System.out.println("The student marks are  "+marks);
    }
}


class GradeCalculator{
    public char calculateGrade(double marks){
        char grade;
        if(marks>=90 && marks<=100){
            grade='A';
        }
        else if(marks>=75 && marks<90){
            grade='B';
        }
        else if(marks>=50 && marks<70){
            grade='C';
        }
        else{
            grade='D';
        }

        return grade;

    }
}



public class studentsApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ente the student name:  ");
        String name=sc.nextLine();

        System.out.println("Ente the student grade:  ");
        double marks=sc.nextDouble();

        Student student = new Student(name, marks);
        GradeCalculator calculategrade = new GradeCalculator();
        char grade=calculategrade.calculateGrade(marks);


        student.displayDetatails();
        System.out.println("The students grade is  "+grade);

        sc.close();
        

    }
    
}
