import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number!");
        int number = 0;
        boolean hasNextInt = scanner.hasNextInt();
        if(hasNextInt) {
            number = scanner.nextInt();
            scanner.nextLine();
        } else {
            System.out.println("Diagnose Hurensohn");
        }
        int [] oneToHundred = new int[number];
        for(int i = 0; i < number; i++) {
            oneToHundred[i] = i + 1;

        }
        for(int i = 0; i <= number - 1; i++) {
            System.out.println(oneToHundred[i]);
        }
    }
}
