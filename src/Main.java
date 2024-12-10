import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Teacher marioBaigon = new Teacher(1, "Mario Baigon", 1500);
        Teacher vickybert = new Teacher(3, "Mario Vickybert", 1000);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(marioBaigon);
        teacherList.add(vickybert);



        Student nicolas = new Student(1, "Nicolas", 1);
        Student diego = new Student(2, "Diego", 1);
        Student vini = new Student(5, "Vini Ferreira", 3);

        List<Student> studentList = new ArrayList<>();
        studentList.add(diego);
        studentList.add(vini);
        studentList.add(nicolas);

        School fatec = new School(studentList, teacherList);

        nicolas.payFees(500);
        vini.payFees(6000);
        System.out.println("------School Management------");
        System.out.println("Fatec has earned: $"+ fatec.getTotalMoneyEarned());

        System.out.println("------Making Fatec pay salary------");
        marioBaigon.receiveSalary(marioBaigon.getSalary());
        marioBaigon.receiveSalary(marioBaigon.getSalary());
        System.out.println("Fatec has spent for salary to " + marioBaigon.getName() + "and now has $" +fatec.getTotalMoneyEarned());
        System.out.println("So, Fatec has spent: $" + fatec.getTotalMoneySpent() + " with teachers salaries");


        vickybert.receiveSalary(vickybert.getSalary());
        System.out.println("Fatec has spent for salary to " + marioBaigon.getName() + "and now has $" +fatec.getTotalMoneyEarned());
        System.out.println("So, Fatec has spent: $" + fatec.getTotalMoneySpent() + " with teachers salaries");

        System.out.println(" ");


        System.out.println(marioBaigon);
        System.out.println(diego);
    }
}