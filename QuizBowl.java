import java.io.*;
import java.util.*;

abstract class Question {
    String question;
    int points;

    public Question(String question, int points) {
        this.question = question;
        this.points = points;
    }

    public abstract boolean checkAnswer(String answer);
    public abstract void displayQuestion();
    public int getPoints() { return points; }
    public abstract String getCorrectAnswer(); // Added method to access correctAnswer
}

class QuestionTF extends Question {
    private String correctAnswer;

    public QuestionTF(String question, int points, String correctAnswer) {
        super(question, points);
        this.correctAnswer = correctAnswer.toLowerCase();
    }

    public boolean checkAnswer(String answer) {
        return answer.toLowerCase().equals(correctAnswer);
    }

    public void displayQuestion() {
        System.out.println("Question: " + question + " (true/false)");
    }

    public String getCorrectAnswer() { return correctAnswer; } // Added method
}

class QuestionMC extends Question {
    private List<String> options;
    private String correctAnswer;

    public QuestionMC(String question, int points, List<String> options, String correctAnswer) {
        super(question, points);
        this.options = options;
        this.correctAnswer = correctAnswer.toUpperCase();
    }

    public boolean checkAnswer(String answer) {
        return answer.toUpperCase().equals(correctAnswer);
    }

    public void displayQuestion() {
        System.out.println("Question: " + question);
        char choice = 'A';
        for (String option : options) {
            System.out.println(choice + ") " + option);
            choice++;
        }
    }

    public String getCorrectAnswer() { return correctAnswer; } // Added method
}

class QuestionSA extends Question {
    private String correctAnswer;

    public QuestionSA(String question, int points, String correctAnswer) {
        super(question, points);
        this.correctAnswer = correctAnswer.toLowerCase();
    }

    public boolean checkAnswer(String answer) {
        return answer.toLowerCase().equals(correctAnswer);
    }

    public void displayQuestion() {
        System.out.println("Question: " + question);
    }

    public String getCorrectAnswer() { return correctAnswer; } // Added method
}

class Player {
    String firstName, lastName;
    int score = 0;

    public Player(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void updateScore(int points) {
        this.score += points;
    }

    public int getScore() { return score; }
}

public class QuizBowl {
    private ArrayList<Question> questions = new ArrayList<>();
    private Player player;

    public void loadQuestions(String fileName) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        int n = Integer.parseInt(br.readLine().trim());

        for (int i = 0; i < n; i++) {
            String[] parts = br.readLine().split(" ");
            String type = parts[0];
            int points = Integer.parseInt(parts[1]);
            String questionText = br.readLine().trim();

            if (type.equals("TF")) {
                String answer = br.readLine().trim();
                questions.add(new QuestionTF(questionText, points, answer));
            } else if (type.equals("MC")) {
                int optionCount = Integer.parseInt(br.readLine().trim());
                List<String> options = new ArrayList<>();
                for (int j = 0; j < optionCount; j++) {
                    options.add(br.readLine().trim());
                }
                String correctAnswer = br.readLine().trim();
                questions.add(new QuestionMC(questionText, points, options, correctAnswer));
            } else if (type.equals("SA")) {
                String answer = br.readLine().trim();
                questions.add(new QuestionSA(questionText, points, answer));
            }
        }
        br.close();
    }

    public void startQuiz() {
        Scanner sc = new Scanner(System.in);
        System.out.print("What is your first name? ");
        String firstName = sc.nextLine().trim();
        System.out.print("What is your last name? ");
        String lastName = sc.nextLine().trim();
        player = new Player(firstName, lastName);

        System.out.print("How many questions would you like (out of " + questions.size() + ")? ");
        int questionCount;
        while (true) {
            try {
                questionCount = Integer.parseInt(sc.nextLine().trim());
                if (questionCount <= 0 || questionCount > questions.size()) {
                    System.out.println("Sorry, that is not valid.");
                } else {
                    break;
                }
            } catch (Exception e) {
                System.out.println("Sorry, that is not valid.");
            }
        }

        Collections.shuffle(questions);

        for (int i = 0; i < questionCount; i++) {
            Question q = questions.get(i);
            System.out.println("\nPoints: " + player.getScore());
            q.displayQuestion();
            System.out.print("Your answer (or type 'SKIP' to skip): ");
            String answer = sc.nextLine().trim();

            if (answer.equalsIgnoreCase("SKIP")) {
                System.out.println("You have elected to skip that question.");
                continue;
            }

            if (q.checkAnswer(answer)) {
                System.out.println("Correct! You get " + q.getPoints() + " points.");
                player.updateScore(q.getPoints());
            } else {
                System.out.println("Incorrect, the answer was: " + q.getCorrectAnswer());
                player.updateScore(-q.getPoints());
            }
        }

        System.out.println("\n" + player.firstName + " " + player.lastName + ", your game is over!");
        System.out.println("Your final score is " + player.getScore() + " points.");
        System.out.println(player.getScore() >= 0 ? "Great job!" : "Better luck next time!");
    }

    

    public static void main(String[] args) throws IOException {
        QuizBowl quiz = new QuizBowl();
        Scanner sc = new Scanner(System.in);
        System.out.print("What file stores your questions? ");
        String fileName = sc.nextLine().trim();
        quiz.loadQuestions(fileName);
        quiz.startQuiz();
    }
}
