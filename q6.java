public class q6 {
//     Q6. Write a do-while loop that will print out all the multiples of 3 from 3 to 36, that
// is: 3 6 9 12 15 18 21 24 27 30 33 36. 
    public static void main(String []args){
         int start = 3, end = 36;
         int i = 1;
         do{
              System.out.print(start * i + " ");
              i++;
         }while(i <= 12);
    }
}
