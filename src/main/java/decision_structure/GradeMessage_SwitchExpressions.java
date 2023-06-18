package decision_structure;

import java.util.Scanner;

public class GradeMessage_SwitchExpressions {

    public static void main(String[] args) {
        System.out.println("Enter your letter grade.");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();
        scanner.close();

        String message = switch(grade){
            case "A" -> "Excellent job!";

            case "B" -> "Great job!";

            case "C" -> "Good job!";

            case "D" -> "You need to work a bit harder";

            default -> "Error. Invalid grade";
        };

        System.out.println(message);
    }
}
