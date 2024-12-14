import java.util.ArrayList;
import java.util.Scanner;

public class QuizGenerator {

    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to the Quiz Generator!");
        mainMenu();
    }

    public static void mainMenu() {
        int choice;
        do {
            System.out.println("\nMain Menu:");
            System.out.println("1. Create Quiz");
            System.out.println("2. Take Quiz");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    createQuiz();
                    break;
                case 2:
                    takeQuiz();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 3);
    }

   
    public static void createQuiz() {
        String quizName, question;
        ArrayList<Question> questions = new ArrayList<>();

        System.out.print("Enter quiz name: ");
        quizName = scanner.nextLine();
        scanner.nextLine();

        do {
            System.out.print("Enter question (or 'q' to quit): ");
            question = scanner.nextLine();
            if (!question.equalsIgnoreCase("q")) {
                questions.add(createQuestion(question));
            }
        } while (!question.equalsIgnoreCase("q"));

        System.out.println("Quiz created successfully!");
        
    }

    public static Question createQuestion(String question) {
        ArrayList<String> options = new ArrayList<>();
        String answer;

        System.out.println("Enter multiple choice options (or 'o' to finish): ");
        String option;
        do {
            option = scanner.nextLine();
            if (!option.equalsIgnoreCase("o")) {
                options.add(option);
            }
        } while (!option.equalsIgnoreCase("o"));

        System.out.print("Enter the correct answer (option letter): ");
        answer = scanner.nextLine();

        return new Question(question, options, answer);
    }

    public static void takeQuiz() {
        
        String quizName = "Sample Quiz"; 
        ArrayList<Question> questions = getQuizQuestions(quizName); 

        int score = 0;
        for (Question question : questions) {
            System.out.println(question.getQuestion());
            for (int i = 0; i < question.getOptions().size(); i++) {
                System.out.println((char) ('A' + i) + ". " + question.getOptions().get(i));
            }

            System.out.print("Enter your answer: ");
            String userAnswer = scanner.nextLine().toUpperCase();

            if (userAnswer.equals(question.getCorrectAnswer())) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Incorrect. The correct answer was: " + question.getCorrectAnswer());
            }
        }

        System.out.println("You scored " + score + " out of " + questions.size());
    }

    public static ArrayList<Question> getQuizQuestions(String quizName) {
        return new ArrayList<>(); 
    }

     public static class Question {
        private String question;
        private ArrayList<String> options;
        private String correctAnswer;

        public Question(String question, ArrayList<String> options, String correctAnswer) {
            this.question = question;
            this.options = options;
            this.correctAnswer = correctAnswer;
        }

        public String getQuestion() {
            return question;
        }

        public ArrayList<String> getOptions() {
            return options;
        }

        public String getCorrectAnswer() {
            return correctAnswer;
        }
    }
}
