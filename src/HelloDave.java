import java.util.Scanner;

public class HelloDave {

    public static void main (String args[])
    {
        Scanner keyboard = new Scanner(System.in);

        String firstname = "firstname";
        System.out.println("Your First Name:");
        firstname = keyboard.nextLine();

        String lastname = "lastname";
        System.out.println("Your Last Name:");
        lastname = keyboard.nextLine();

        System.out.println(helloName(firstname, lastname));
        System.out.println(helloFrench(firstname, lastname));
        System.out.println(helloTwi(firstname, lastname));
        System.out.println(helloAfaa(firstname, lastname));

    }
    public static String helloName(String firstname, String lastname)
    {
        return "Hello," +firstname+ lastname + "!";

    }
    public static String helloFrench(String firstname, String lastname)
    {
        return "Bonjour," +firstname+ lastname + "!";

    }

    public static String helloTwi(String firstname, String lastname)
    {
        return "Mahai," +firstname+ lastname + "!";

    }

    public static String helloAfaa(String firstname, String lastname)
    {
        return "Akam," +firstname+ lastname + "!";

    }
}
