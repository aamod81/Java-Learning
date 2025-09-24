import javax.swing.*;

public class PracticeSet_30 {
    public static void main(String[] args) {
// float [] marks ={10,20,30,40,50,60,70,80,90,100};
//  float sum = 0;
//  for(float element:marks){
//      sum=sum+element;
//  }
//        System.out.println("The sum is "+sum);
//        float[] marks = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
//        float num = 45;
//        boolean isInArray = false;
//        for (float element : marks) {
//            if (num == element) {
//                isInArray = true;
//                break;
//            }
//        }
//        if (isInArray) {
//            System.out.println("the value is present in array");
//        } else {
//            System.out.println("the value is not present in array");
//        }
        //problem3
//        float[] marks = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
//        float sum =0;
//        for(float element:marks){
//            sum=sum+element;
//        }
//        System.out.printf("The value of average marks is :"+sum/marks.length);
   // problem4
        int [] [] mat1 = {{1,2,3},
                {4,5,6}};
        int [] [] mat2 = {{1,2,3},
        {4,5,6}};
        int [] [] result ={{ 0,0,0},
                {0,0,0}};
        for(int i=0;i<mat1.length;i++){
            for(int j=0;j<mat1[i].length;j++){
                System.out.format("setting the value for i=%d and j=%d\n",i,j);
                result[i][j]= mat1[i][j] + mat2[i][j];}}
                    for(int i=0;i<mat1.length;i++){
                        for(int j=0;j<mat1[i].length;j++){
                            System.out.print(result[i][j]+ " ");
                            result[i][j]= mat1[i][j] + mat2[i][j];
                        }
                        System.out.println(" ");
                    }
                }

    }
