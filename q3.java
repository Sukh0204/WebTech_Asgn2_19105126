import java.util.Scanner;

public class q3 {
//     Q3. Consider the index of the month (let say 1 for January). Write a java program to
// print the name of the month and number of days in the month. Use Switch Case. 
   public static void main(String []args){
    System.out.println("Enter month: ");
        // Creating a Scanner object
    Scanner scannerObj = new Scanner(System.in); 
    int month = scannerObj.nextInt();
    //switch case to get month name and num days
    // needs to be hard coded since month is unique to each input
    switch(month){
        case 1:
        System.out.println("Month is: January and Number of Days are: 31");
        break;

        case 2:
        System.out.println("Month is: February and Number of Days are: 28");
        break;

        case 3:
        System.out.println("Month is: March and Number of Days are: 31");
        break;

        case 4:
        System.out.println("Month is: April and Number of Days are: 30");
        break;

        case 5:
        System.out.println("Month is: May and Number of Days are: 31");
        break;

        case 6:
        System.out.println("Month is: June and Number of Days are: 30");
        break;

        case 7:
        System.out.println("Month is: July and Number of Days are: 31");
        break;

        case 8:
        System.out.println("Month is: August and Number of Days are: 31");
        break;

        case 9:
        System.out.println("Month is: September and Number of Days are: 30");
        break;

        case 10:
        System.out.println("Month is: October and Number of Days are: 31");
        break;

        case 11:
        System.out.println("Month is: November and Number of Days are: 30");
        break;

        case 12:
        System.out.println("Month is: December and Number of Days are: 31");
        break;

        default:
        System.out.println("Invalid Input");
    }
    scannerObj.close();
   

   }
}
