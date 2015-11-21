import java.util.ArrayList;
import java.util.List;

/**
 * Created by tomer on 11/21/15.
 */
public class StudentList {
    List<Student> students;

    public StudentList() {
        students = new ArrayList<>();
    }

    public void add(Student st) {
        students.add(st);
    }

    public Student del(String name) {
        for (Student student : students) {
            if (student.getName().equals(name)) {
                students.remove(student);
                return student;
            }
        }
        return null;
    }

    public Student getStudent(String name) {
        for (Student student : students) {
            if (student.getName().equals(name)) {
                return student;
            }
        }
        return null;
    }

    public String toString() {
        String list = "";
        for (Student student : students) {
            list = list + student.getName() + " " + student.getPhone() + "\n";
        }
        return list;
    }
}
