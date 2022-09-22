public class MinOfThree {
// Q2. Write the main() method of the MinOfThree class that determines which of the
// three numbers is the smallest number, and displays that number using if-else
// statement.(Note: You don’t have to take input from user. ) 

    public static void main(String []args){
         int first = 20, second = 10, third = 5;
         int min = first;
          if(min > second && min < third){
             min = second;
             System.out.println("MinOfThree is: " + min);
          }
          else if(min > third){
            min = third;
            System.out.println("MinOfThree is: " + min);
         } else{
            System.out.println("MinOfThree is: " + min);
         }
         
    }
}
