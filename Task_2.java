import java.util.Scanner;

public class Student_Grade_Calculator {
    public static void main(String[] args) {
        double Sum = 0;
        double Percentage;
        Scanner sc = new Scanner(System.in);
        System.out.println("Number of Subjects:");
        int total_subjects = sc.nextInt();

        for (int i = 1; i <= total_subjects; i++) {
            System.out.printf("Total Marks Obtained In The Subject %d Out Of 100: ", i);
            int number = sc.nextInt();
            if (number < 0 || number > 100) {
                System.out.println("Invalid Input...");
                System.exit(0);
            }
            Sum = Sum + number;
        }

        Percentage = Sum / total_subjects;

        if (Percentage > 90 && Percentage <= 100) {
            System.out.println("Total Marks Is--> " + Sum);
            System.out.println("Percentage Is--> " + Percentage + "%");
            System.out.println("Grade is--> O");
        }

        else if (Percentage > 80 && Percentage <= 89) {
            System.out.println("Total Marks Is--> " + Sum);
            System.out.println("Percentage Is-->  " + Percentage + "%");
            System.out.println("Grade is--> E");
        }

        else if (Percentage > 70 && Percentage <= 79) {
            System.out.println("Total Marks Is--> " + Sum);
            System.out.println("Percentage Is-->  " + Percentage + "%");
            System.out.println("Grade is--> A");
        }

        else if (Percentage > 60 && Percentage <= 69) {
            System.out.println("Total Marks Is--> " + Sum);
            System.out.println("Percentage Is--> " + Percentage + "%");
            System.out.println("Grade is--> B");
        }

        else if (Percentage > 50 && Percentage <= 59) {
            System.out.println("Total Marks Is--> " + Sum);
            System.out.println("Percentage Is--> " + Percentage + "%");
            System.out.println("Grade is--> C");
        }

        else if (Percentage > 40 && Percentage <= 49) {
            System.out.println("Total Marks Is--> " + Sum);
            System.out.println("Percentage Is--> " + Percentage + "%");
            System.out.println("Grade is--> D");
        }

        else {
            System.out.println("STUDENT FAILED...\n");
        }

        sc.close();
    }
}
