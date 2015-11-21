/**
 * Created by tomer on 11/21/15.
 */
public class Parent {
    private String name;
    private int cellNum;

    public Parent(String name, int cellNum) {
        this.name = name;
        this.cellNum = cellNum;
    }

    public void setCellNum(int cellNum) {
        this.cellNum = cellNum;
    }

    public String getName() {
        return name;
    }

    public int getCellNum() {
        return cellNum;
    }
}
