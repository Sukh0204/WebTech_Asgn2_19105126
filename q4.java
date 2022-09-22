public class q4 {
//     Q4. A city of 80,000 peoples is increasing at the rate of 5% annually. When will
// their population first exceed 150000? Write a java program for it. Use While Loop. 

    public static void main(String []args){
         int IntialPopulation = 80000;
         int NumYears = 0;
         while(IntialPopulation <= 150000){
            IntialPopulation += 0.05 *IntialPopulation;
            NumYears++;
         }
         System.out.println("Number of Years after population increases to 150000 is: " + NumYears);
    }
}
