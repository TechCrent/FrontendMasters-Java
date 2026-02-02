package Practice;

public class QuestionTwo {
    public static void main(String[] args){
        //Declaring variables
        int totalMarks;

        int numberOfSubjects;


        //Initializing variables
         totalMarks = 50;
         numberOfSubjects = 2;
         int average = (totalMarks)/numberOfSubjects;

         double result = (double)average;

        //The average is obtained by summing all
        // the marks and dividing by the numberOfSubjects.
        // Going further,the state of the answer was changed
        // from an integer to a decimal value using the
        // explicit casting.
        System.out.println("Average " + result);
    }

}
