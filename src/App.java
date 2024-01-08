import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Controllers.AccountController;
import Domain.PersonComparator;
import Domain.Student;
import Domain.StudentGroup;
import Domain.Teacher;
import Domain.Employee;

public class App {
    public static void main(String[] args) throws Exception {

        Student s1 = new Student("Иван", 25);
        Student s2 = new Student("Игорь", 23);
        Student s3 = new Student("Иван", 22);
        Student s4 = new Student("Игорь",  23);
        Student s5 = new Student("Даша",  23);
        Student s6 = new Student("Лена",  23);
        

        List<Student> listStud = new ArrayList<Student>();
        listStud.add(s1);
        listStud.add(s2);
        listStud.add(s3);
        listStud.add(s4);
        listStud.add(s5);
        listStud.add(s6);
        

        

        // StudentGroup group4580 = new StudentGroup(listStud, 4580);
        // System.out.println(group4580);

        // for(Student std : group4580)
        // {
        //     System.out.println(std);
        // }

        // System.out.println("=========================================================");

        // Collections.sort(group4580.getGroup());

        // for(Student std: group4580.getGroup())
        // {
        //     System.out.println(std);
        // }

        Teacher t1 = new Teacher("Галина", 55, "Docent");
        Teacher t2 = new Teacher("Татьяна", 57, "Docent");
        Teacher t3 = new Teacher("Юрий", 64, "Docent");

        List<Teacher> listTeach = new ArrayList<Teacher>();
        listTeach.add(t1);
        listTeach.add(t2);
        listTeach.add(t3);


        Employee e1 = new Employee("Елена", 30, "Basic");
        Employee e2 = new Employee("Ирина", 45, "Basic");
        Employee e3 = new Employee("Антон", 50, "Basic");

        List<Employee> listEmployees = new ArrayList<Employee>();
        listEmployees.add(e1);
        listEmployees.add(e2);
        listEmployees.add(e3);

        //System.out.println(new PersonComparator<Student>().compare(s1, s3));

       // AccountController controller = new AccountController();
       // controller.paySalary(t1, 50000);
       // controller.paySalary(s1, 50000);

       AccountController.paySalary(t1, 50000);
       

       System.out.println("Средний возраст студентов: " + AccountController.averageAge(listStud));
       System.out.println("Средний возраст преподавателей: " + AccountController.averageAge(listTeach));
       System.out.println("Средний возраст работников: " + AccountController.averageAge(listEmployees));


    }
}