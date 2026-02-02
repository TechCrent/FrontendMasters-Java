package Practice;

public class QuestionOne {

    public static void main(String[] args){
        //Initializing Variables
         int a = 12;
         int b = 5;

         //Summation of variables
         int sum = a + b;

        //select among the two numbers the smaller value
         int small = Math.min(a,b);

        //select among the two numbers the bigger value
         int big = Math.max(a,b);

        //Differentiation between variables
         int diff = big - small;

         //Multiplication between variables
         int mul = a * b;


         System.out.println("Sum " + sum);
         System.out.println("Difference " + diff);
         System.out.println("Product " + mul);
    }

}
