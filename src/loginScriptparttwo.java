import java.util.Scanner;

public class loginScript {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        String username = "Admin";
        String password = "Password!";

        // input username
        System.out.println("Enter username");
        String userName = reader.nextLine();

        // tells you what your username is
        System.out.println("Your username is "+ userName);

        //input password
        System.out.println("Enter Password");
        String passWord = reader.nextLine();


        // user enters their username and password
        if (userName == ("Admin") && passWord == ("Password!")){
            System.out.println("You have been validated!"); // Displays "You have been validated!"
            }
        else {
            System.out.println("Access not authorized!"); // Displays "Access not authorized!"
        }







    }
}
