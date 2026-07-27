import java.util.Scanner;

public class UserService {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your email: ");
        String email = sc.nextLine();
        System.out.println(email);

        System.out.println("Enter your Id: ");
        long id = sc.nextLong();
        System.out.println("ID: " + id + "   Email: " + email);
    }
}
