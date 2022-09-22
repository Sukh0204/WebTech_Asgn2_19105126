import java.util.Scanner;
public class q1{
//   Q1. . Suppose that score is a variable of type double. Write the java statement that
// increases the score by 5 marks if score is between 80 and 90.
   public static void main(String []args){
    System.out.println("Enter score: ");
        // Creating a Scanner object
    Scanner scannerObj = new Scanner(System.in); 
    double score = scannerObj.nextDouble();
    //checking for the correct range - inclusive of 80 and 90
    if(score<=90 || score>=80){
        score+=5;
    }
    System.out.println("Score is: " + score);
    scannerObj.close();
   }
}