class Employee {
    private int id;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String n) {
        this.name = n;
    }

    public void setId(int i) {
        this.id = i;
    }

    public int getId() {
        return id;
    }
}

public class Modifiers_40 {
    public static void main(String[] args) {
        Employee aamod = new Employee();
        aamod.setName("aamod");
        aamod.setId(101);

        System.out.println("Employee ID: " + aamod.getId());
        System.out.println("Employee Name: " + aamod.getName());
    }
}
