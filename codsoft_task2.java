import java.util.Scanner;
public class SGradeCalculator {
    public static void main(String args[]) {
        Scanner o = new Scanner(System.in);
        System.out.println("enter the number of subjects");
        int sub = o.nextInt();
        int[] mks = new int[sub];
        for (int i = 0; i < sub; i++) {
            System.out.println("enter subject marks" + (i + 1) + " is: ");
            mks[i] = o.nextInt();
        }
        int tot = 0;
        for (int i = 0; i < sub; i++) {
            tot += mks[i];
        }
        double avg = (double) tot / sub;
        char grade;
        if (avg >= 90) {
            grade = 'O';
        }
       else if (avg >= 80) {
            grade = 'A';
        }
        else if (avg >= 70) {
            grade = 'B';
        }
        else if (avg >= 60) {
            grade = 'C';
        }
        else if (avg >= 50) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        System.out.println("Total marks:" + tot);
        System.out.println("Average percentage:" + avg);
        System.out.println("Grade obtained:" + grade);
    }
}
