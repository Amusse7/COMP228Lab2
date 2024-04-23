package exercise1;
import javax.swing.JOptionPane;
import java.util.Random;

public class Test {
    private int correctAnswers;
    private int incorrectAnswers;
    private Random randomObject;

    public Test() {
        correctAnswers = 0;
        incorrectAnswers = 0;
        randomObject = new Random();
    }

    public void simulateQuestion(int questionNumber) {
        String question = "";
        String[] options = new String[4];
        String correctOption = "";

        switch (questionNumber) {
            case 1:
                question = "What is the main function of a Java compiler?";
                options[0] = "It translates the Java source code into bytecodes that represent the tasks to execute.";
                options[1] = "It executes the bytecodes";
                options[2] = "It places the program in memory to execute it";
                options[3] = "It examines the bytecodes to ensure that they  are valid and do not violate Java’s security restrictions.";
                correctOption = "It translates the Java source code into bytecodes that represent the tasks to execute.";
                break;
            case 2:
                question = "Which of the following components does a Java application need to have at least one of?";
                options[0] = "Instance variable";
                options[1] = "Non-static Method";
                options[2] = "Local variable";
                options[3] = "Class";
                correctOption = "Class";
                break;
            case 3:
                question = "Which of the following typically groups related classes so that they could be imported into programs and reused?";
                options[0] = "Method";
                options[1] = "Package";
                options[2] = "IDE";
                options[3] = "Function";
                correctOption = "Package";
                break;
            case 4:
                question = "Method arguments may be?";
                options[0] = "constants, variables, or expressions.";
                options[1] = "only variables";
                options[2] = "only strings";
                options[3] = "only constants";
                correctOption = "constants, variables, or expressions.";
                break;
            case 5:
                question = "Class variables must be declared as?";
                options[0] = "var";
                options[1] = "static";
                options[2] = "const";
                options[3] = "final";
                correctOption = "static";
                break;
        }

        String answer = JOptionPane.showInputDialog(null, question, "Question " + questionNumber,
                JOptionPane.QUESTION_MESSAGE, null, options, options[0]).toString();

        if (answer.equals(correctOption)) {
            generateMessage(true);
            correctAnswers++;
        } else {
            generateMessage(false);
            incorrectAnswers++;
        }
    }

    public void generateMessage(boolean isCorrect) {
        String message;
        if (isCorrect) {
            switch (randomObject.nextInt(4)) {
                case 0:
                    message = "Excellent!";
                    break;
                case 1:
                    message = "Good!";
                    break;
                case 2:
                    message = "Keep up the good work!";
                    break;
                default:
                    message = "Nice work!";
                    break;
            }
        } else {
            switch (randomObject.nextInt(4)) {
                case 0:
                    message = "No. Please try again";
                    break;
                case 1:
                    message = "Wrong. Try once more";
                    break;
                case 2:
                    message = "Don't give up!";
                    break;
                default:
                    message = "No. Keep trying..";
                    break;
            }
        }
        JOptionPane.showMessageDialog(null, message);
    }

    public void inputAnswer() {

        for (int i = 1; i <= 5; i++) {
            simulateQuestion(i);
        }

        double percentage = (double) correctAnswers / (correctAnswers + incorrectAnswers) * 100;
        JOptionPane.showMessageDialog(null, "Test Completed!\nCorrect Answers: " + correctAnswers +
                "\nIncorrect Answers: " + incorrectAnswers + "\nPercentage: " + percentage + "%");
    }
}