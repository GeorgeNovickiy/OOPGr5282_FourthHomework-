package Controllers;

import java.util.List;

import Domain.Person;
import Domain.Teacher;

public class AccountController {

    public static <T extends Teacher> void paySalary(T person, int salary) {
        System.out.println(person.getName() + " выплачено зарплата " + salary + "р. ");
    }

    //метод averageAge, который считает средний возраст студентов/преподавателей/работников
    public static <T extends Person> double averageAge(List<T> persons)
    {
        double sumAges=0;
        for (int i=0; i < persons.size(); i++){
            sumAges = sumAges + persons.get(i).getAge();
        }
        return sumAges/persons.size();
    }
}