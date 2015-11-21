/**
 * Created by tomer on 11/21/15.
 */
public class Student {
    private String name;
    private int phone;
    private Parent parent;

    public Student(String name, int phone, Parent parent) {
        this.name = name;
        this.phone = phone;
        this.parent = parent;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getName() {

        return name;
    }

    public int getPhone() {
        return phone;
    }

    public Parent getParent() {
        return parent;
    }
}
