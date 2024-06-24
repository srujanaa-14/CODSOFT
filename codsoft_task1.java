import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner o = new Scanner(System.in);
        int c = 0, Total_score = 0, score = 0;
        int game = 1;
        while (game == 1) {
            Random rand = new Random();
            int random_number = rand.nextInt(101);
            // System.out.println(random_number);
            Total_score++;
            int Guess = 3;
            while (Guess--> 0) {
                System.out.println("Enter a random number in range 0 to 100:");
                int entered_random_number = o.nextInt();
                if (entered_random_number == random_number) {
                    System.out.println("The entered number matched!");
                    score++;
                    break;
                } else if (entered_random_number < random_number) {
                    System.out.println("The entered number is too low for the generated number,better luck next time!");
                } else
                    System.out.println("The entered number is too high for the generated number,better luck next time!");
                if (Guess == 0)

                    System.out.println("Your game ends now.");
            }

            System.out.println("The generated random number is:" + random_number);

            System.out.println("Do u wish to play another game?");
            System.out.println("if Yes,press 1.");
            System.out.println("if No,press any key.");
            game = o.nextInt();

        }
        System.out.println("Your score is:" + score + "/" + Total_score);
    }
}
