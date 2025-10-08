import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

//public class filehandling_111 {
//    public static void main(String[] args)  {
      /*  File Myfile = new File("aamod");
        try {
            Myfile.createNewFile();
        } catch (IOException e) {
            System.out.println("Error");
            throw new RuntimeException(e);

        try {
            FileWriter fr = new FileWriter("lucky");
            fr.write("this is our first file in java course\n ok now bye");
            fr.close();
        }
        catch (IOException e) {
            e.printStackTrace();

       */
//        }
//    }
import java.io.*;
import java.util.Scanner;

public class filehandling_111 {
    public static void main(String[] args) {
      /*  File file = new File("lucky.txt");
        try {
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }

            FileWriter writer = new FileWriter(file, true);
            writer.write("Hello! This is my Java file handling example.\n");
            writer.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
*/
        File file=new File("C:\\Users\\amodk\\Desktop\\");
        try{
            Scanner sc=new Scanner(file);
            while(sc.hasNextLine()){
                String line=sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        } catch(FileNotFoundException e){
            e.printStackTrace();
        }
    }}