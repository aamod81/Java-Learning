public class Oops_39 {
    static class Employee {
        int id;
        String name;
        int salary;

        public void setId(int a) {
            id =a;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        } public int getSalary() {
            return salary;
        } public void setName(String n) {
            name=n;
        }
    }
    public static void main(String[] args) {
        Employee aamod = new Employee();


//        aamod.getId();
        aamod.salary=55000;
        aamod.setName("Aamod");
//        aamod.id=4;
        System.out.println("name:"+aamod.getName());
        System.out.println("salary:"+aamod.getSalary());
        aamod.setId(45);
        System.out.println("id:"+aamod.getId());
    }
}
