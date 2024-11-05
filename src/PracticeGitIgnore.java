import java.util.Scanner;

public class PracticeGitIgnore {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1st String:");
        String s1 = scanner.nextLine();
        System.out.println("Enter 2nd String:");
        String s2 = scanner.nextLine();
        System.out.println(s1.concat(s2));
        scanner.close();
    }
}
