/**
 * Created by tomer on 11/16/15.
 */
public class Test {
    public static void main(String[] args) {
        StudentList studentList = new StudentList();
        studentList.add(new Student("Tomer",1111,new Parent("s",1)));
        studentList.add(new Student("Bomer",1111,new Parent("s",1)));
        studentList.add(new Student("Comer",1111,new Parent("s",1)));
        studentList.add(new Student("Zomer",1111,new Parent("s",1)));
        System.out.println(studentList.toString());
    }


}
