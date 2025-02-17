import java.util.*;

public class Storyyy {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Story Time!!!");
        while (true) {
            System.out.println("\nLet's choose a story genre:");
            System.out.println("1. Fantasy");
            System.out.println("2. Science-Fiction");
            System.out.println("3. Mystery");
            System.out.println("4. Horror");
            System.out.println("5. Done for now. Exit");

            int choice = UserChoice.getChoice(5);
            if (choice == 5) {
                System.out.println("Thank you. Goodbye!");
                break;
            }

            switch (choice) {
                case 1:
                    Fantasy.display();
                    break;
                case 2:
                    ScienceFiction.display();
                    break;
                case 3:
                    Mystery.display();
                    break;
                case 4:
                    Horror.display();
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

class Fantasy {
    public static void display() {
        System.out.println("\nChoose a story:");
        System.out.println("1. Sweetbread: An Epilogue");
        System.out.println("2. Lost in a Dark Place");
        int storyChoice = UserChoice.getChoice(2);

        switch (storyChoice) {
            case 1:
                System.out.println("\nHere is your story: \n");
                System.out.println("Two sisters, who have endured hardship under the control of a cruel stepmother, escape her grasp...");
                break;
            case 2:
                System.out.println("\nHere is your story: \n");
                System.out.println("A person wakes up in a crashed craft pod on an unknown planet...");
                break;
            default:
                System.out.println("Invalid choice.");
        }
        Rating.collect("Fantasy");
    }
}

class ScienceFiction {
    public static void display() {
        System.out.println("\nChoose a story:");
        System.out.println("1. Add Vodka to Taste");
        System.out.println("2. A fight for light");
        int storyChoice = UserChoice.getChoice(2);

        switch (storyChoice) {
            case 1:
                System.out.println("\nHere is your story: \n");
                System.out.println("Valerian, haunted by memories of his friend Roman...");
                break;
            case 2:
                System.out.println("\nHere is your story: \n");
                System.out.println("Dr. Tavian Solen and his team are conducting an expedition in a cave on Janeri Prime...");
                break;
            default:
                System.out.println("Invalid choice.");
        }
        Rating.collect("Sci-Fi");
    }
}

class Mystery {
    public static void display() {
        System.out.println("\nChoose a story:");
        System.out.println("1. Seven Hundred and Thirty Days");
        System.out.println("2. Pendulum Swing");
        int storyChoice = UserChoice.getChoice(2);

        switch (storyChoice) {
            case 1:
                System.out.println("\nHere is your story: \n");
                System.out.println("In this intense, emotionally charged narrative, Jackie reflects on her past...");
                break;
            case 2:
                System.out.println("\nHere is your story: \n");
                System.out.println("At an elegant party, a mysterious man arrives unnoticed...");
                break;
            default:
                System.out.println("Invalid choice.");
        }
        Rating.collect("Mystery");
    }
}

class Horror {
    public static void display() {
        System.out.println("\nChoose a story:");
        System.out.println("1. Venus Buried");
        System.out.println("2. THAT THING ON THE HILL");
        int storyChoice = UserChoice.getChoice(2);

        switch (storyChoice) {
            case 1:
                System.out.println("\nHere is your story: \n");
                System.out.println("The story follows a girl, Bette, who feels consumed by guilt...");
                break;
            case 2:
                System.out.println("\nHere is your story: \n");
                System.out.println("A person recounts their experience with their best friend, David Castro...");
                break;
            default:
                System.out.println("Invalid choice.");
        }
        Rating.collect("Horror");
    }
}

class Rating {
    public static void collect(String genre) {
        System.out.println("\nDid you enjoy the story? Please rate it (1 to 5):");
        int rating = UserChoice.getChoice(5);
        System.out.println("Thank you for rating the " + genre + " story with a score of " + rating + ".");
    }
}

class UserChoice {
    public static int getChoice(int max) {
        int choice = -1;
        while (true) {
            try {
                System.out.print("Enter your choice: ");
                choice = Integer.parseInt(Storyyy.sc.nextLine());
                if (choice >= 1 && choice <= max) {
                    break;
                } else {
                    System.out.println("Invalid choice. Please choose a number between 1 and " + max + ".");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }
        return choice;
    }
}
