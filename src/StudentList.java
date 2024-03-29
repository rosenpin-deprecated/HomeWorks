import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by tomer on 11/21/15.
 */
public class StudentList {
    private List<Student> students;
    private int size;

    public StudentList() {
        students = new ArrayList<>();
    }

    public void add(Student st) {
        students.add(st);
        updateSize();
    }

    public Student del(String name) {
        for (Student student : students) {
            if (student.getName().equals(name)) {
                students.remove(student);
                updateSize();
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

    public int getSize() {
        return size;
    }

    public String toString() {
        String list = "";
        Collections.sort(students, new Comparator<Student>() {
            public int compare(Student v1, Student v2) {
                return v1.getName().compareTo(v2.getName());
            }
        });
        for (Student student : students) {
            list = list + student.getName() + " " + student.getPhone() + "\n";
        }
        return list;
    }

    private void updateSize(){
        this.size = students.size();
    }
}
