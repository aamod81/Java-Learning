public class constructor_40 {
   static class MyEmployee {
       private int id = 5;
       private String name = "aamod" ;
       public MyEmployee(){
            id=45;
           name = "aamodg";
       }
       public String getName() {return name;}
       public String setName(String name){this.name=name; return name;}

       public void setId(int id) {
           this.id  = id;
       } public int getId() {
           return id;
       }
       public static void main(String[] args) {
           MyEmployee aamod = new MyEmployee();
        //   aamod.setName("aamod");
           System.out.println(aamod.getName());
           //aamod.setId(1);
           System.out.println(aamod.getId());
       }
   }
}
