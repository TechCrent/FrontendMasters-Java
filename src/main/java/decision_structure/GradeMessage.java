package decision_structure;

import java.util.Scanner;

public class GradeMessage {

    public static void main(String[] args){
        System.out.println("Enter your letter grade");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();
        scanner.close();

        String message;

        switch(grade){
            case "A":
            case "a":
                message = "Excellent job!";
                break;

            case "B":
            case "b":
                message = "Great job!";
                break;

            case "C":
            case "c":
                message = "Good job!";
                break;

            case "D":
            case "d":
                message = "You need to work a bit harder";
                break;

            case "F":
            case "f":
                message = "Uh oh!";
                break;

            default:
                message = "Error. Invalid grade";
                break;
        }

        System.out.println(message);
    }
}
