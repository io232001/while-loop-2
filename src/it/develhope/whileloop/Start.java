package it.develhope.whileloop;
import java.util.Scanner;
public class Start
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String command = "";
        while (!command.equals("stop")) {
            System.out.print("Please enter a command: ");
            command = scanner.nextLine();
            System.out.println("----------------------------");
            System.out.println("Command is: " + command);
            System.out.println("----------------------------");
        }
    }
}
