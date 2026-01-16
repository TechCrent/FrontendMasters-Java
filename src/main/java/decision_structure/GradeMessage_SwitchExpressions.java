package decision_structure;

import java.util.Scanner;

public class GradeMessage_SwitchExpressions {

    public static void main(String[] args){
        System.out.println("Enter your letter grade");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();
        scanner.close();

        String message = switch(grade){
            case "A", "a" -> "Excellent job!";
            case "B", "b" -> "Great job!";
            case "C", "c" -> "Good job!";
            case "D", "d" -> "You need to work a bit harder";
            case "F", "f" -> "Uh oh!";
            default -> "Error. Invalid grade";
        };

        System.out.println(message);
    }
}
