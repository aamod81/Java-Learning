public class oops_36 {
  static class Employee{
      int id;
      int salary;
      String name;
      public void printdetails(){
          System.out.println("Employee id : " + id);
          System.out.println("Employee name : " + name);
          System.out.println("Employee salary : " + salary);
      }
  }
    public static void main(String[] args) {
        System.out.println("this is our custom class");
        Employee aamod = new Employee ();
        Employee lucky = new Employee ();
        aamod.id = 15;
        aamod.salary = 440000;
        aamod.name = "aamod";
        lucky.id=16;
        lucky.name = "lucky";
        lucky.salary = 440000;
        aamod.printdetails();
        lucky.printdetails();
    }
}
