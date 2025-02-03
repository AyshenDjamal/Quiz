import java.util.Scanner;


public class Main {

    public static final Scanner input = new Scanner(System.in);
    public static boolean status = true;
    public static int index = 0;
    public static Player user;
    public static final Quiz[] questions = {
            new Quiz("4*3=?", "A)23", "B)12", "C)8", "D)16", "B", 2),
            new Quiz("What is the capital of France?", "A)Toronto", "B)Berlin", "C)Paris", "D)Sydney", "C", 2),
            new Quiz("What type of language is Java?", "A)High-level", "B)Low-level", "C)Assembly", "D)Machine", "A", 3),
            new Quiz("20+30=?", "A)45", "B)50", "C)40", "D)35", "B", 4),
            new Quiz("Which operator is used for comparison in Java?", "A)=", "B)!=", "C)==", "D)<=", "C", 5),
    };

    public static void main(String[] args) {
        System.out.println("Welcome come to Quiz!!!");
        Menu();
    }

    static void Menu() {
        System.out.println("*********************");
        System.out.println("1-Enter");
        System.out.println("2-Start Quiz");
        System.out.println("0-Exit");
        System.out.println("*********************");
        System.out.print("Select: ");
        int menu = input.nextInt();

        switch (menu) {
            case 1:
                Login();
                break;
            case 2:
                    StartQuiz();
                break;
            default:
                Exit();
        }
    }

    static void Login() {
        System.out.println("Enter Your Full Name");
        input.nextLine();
        String nameSurname = input.nextLine();
        user = new Player(nameSurname);
        status = true;
        Menu();
    }

    static void StartQuiz() {
        if(status) {
            System.out.println("Quiz");
            questions[index].displayQuestions(index + 1);
            System.out.print("Answer: ");
            String answers = input.next();
            if (questions[index].isTrue(answers)) {
                user.bonusPoints(questions[index].point);// user-i sorush
                index++;

                if (index < questions.length) StartQuiz();
                else user.endGame("Your Quiz is Done");
            } else {
                user.penalty();
                index++;
                if (user.chance > 0) StartQuiz();
            }
        }else {
                System.out.println("You need to log in");
                Login();
            }
        }


    static void Exit() {
        System.out.println("Do you want to continue");
        String status = input.next();
        if (status.equals("No")) {
            System.out.println("Good Bye!");
        }else{
            Menu();
        }
    }

}
