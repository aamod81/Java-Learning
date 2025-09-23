public class exestring1 {
     public static void main(String[] args) {
         //problem1
         String name = "aamod";
         name=name.toUpperCase();
         System.out.println(name);
         //problem 2
         String text = "he is a good boy";
         text = text.replace(" ","_");
         System.out.println(text);
         //problem3
         String text1="dear <|name|> thankyou";
         text1=text1.replace("<|name|>","aamod");
         System.out.println(text1);
         //problem3
         String text2="he   is a   good   boy";
         System.out.println(text2.indexOf(" "));
         System.out.println(text2.indexOf("  "));
         //problem3

     }
}
