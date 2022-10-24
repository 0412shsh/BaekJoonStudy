package level2;

import java.util.Scanner;

public class Timer {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int A = sc.nextInt();
      int B = sc.nextInt();
      int C = sc.nextInt();

      B = B + C;
      
      int a = B/60; 
      int b = B%60; 
      
      if(B>=60){
         A=A+a;
         B=b;
         if(A>=24){
            A=A-24;
         }
      } 
      
      System.out.println(A+" "+B);
   }

}