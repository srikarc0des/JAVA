import java.util.Scanner;

public class ChatBot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;

        System.out.println("Hello! I am your chatbot. Type 'exit' to end the chat.");

        while (true) {
            System.out.print("You: ");
            input = scanner.nextLine().toLowerCase();

            if (input.equals("exit")) {
                System.out.println("ChatBot: Goodbye! Have a nice day.");
                break;
            }

            respondToUser(input);
        }

        scanner.close();
    }

    public static void respondToUser(String input) {
        if (input.contains("hello") || input.contains("hi")) {
            System.out.println("ChatBot: Hello there!");
        } else if (input.contains("how are you")) {
            System.out.println("ChatBot: I'm just a bot, but I'm doing fine!");
        } else if (input.contains("name")) {
            System.out.println("ChatBot: I am a simple Java chatbot.");
        } else if (input.contains("help")) {
            System.out.println("ChatBot: You can ask me things like 'hello', 'how are you', or 'what is your name'.");
        } else {
            System.out.println("ChatBot: I'm not sure how to respond to that.");
        }
    }
}
