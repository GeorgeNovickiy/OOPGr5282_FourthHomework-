package Services;

import java.util.ArrayList;
import java.util.List;

import Domain.PersonComparator;
import Domain.Teacher;


public class TeacherService implements iPersonService<Teacher> {

    private int count;
    private List<Teacher> teachers;

    public TeacherService() {
        this.teachers = new ArrayList<>();
    }

    @Override
    public List<Teacher> getAll() {
        return teachers;
    }

    @Override
    public void create(String name, int age) {
        Teacher teachs = new Teacher(name, age, "Docent");
        count++;
        teachers.add(teachs);
    }

    public void sortByFIO()
    {
        PersonComparator<Teacher> persComp = new PersonComparator<Teacher>();
        teachers.sort(persComp);
    }
}