import java.util.*;
public class StoryReader 
{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.println("Story Time!!!");
        while (true) 
	{
            System.out.println("\nLet's choose a story genre:");
            System.out.println("1. Fantasy");
            System.out.println("2. Science-Fiction");
            System.out.println("3. Mystery");
            System.out.println("4. Horror");
            System.out.println("5. Done for now. Exit");

            int choice=UserChoice.getChoice(5);
            if (choice==5) 
	    {
                System.out.println("Thank you. Goodbye!");
                break;
            }
            switch (choice) 
	    {
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

class Fantasy 
{
    public static void display() 
    {
        System.out.println("\nChoose a story:");
        System.out.println("1. Sweetbread: An Epilogue");
        System.out.println("2. Lost in a Dark Place");
        int storyChoice=UserChoice.getChoice(2);
        switch (storyChoice) 
	{
            case 1:
                System.out.println("\nHere is your story: \n");
                System.out.println("Two sisters, who have endured hardship under the control of a cruel stepmother, escape her grasp and return with stolen treasure. The older sister is protective and takes the lead, while the younger one, once tender-hearted, shows signs of coldness and resolve. Despite their father's apology and regret for losing track of them, the sisters' anger grows. The younger sister, who once had a soft heart, uses the witch's potions to help her stepmother, ultimately taking revenge. The stepmother and father die after consuming poisoned sweetbread, with the younger sister revealing her transformation into someone willing to protect herself and her sister, no matter the cost.");
                break;
            case 2:
                System.out.println("\nHere is your story: \n");
                System.out.println("A person wakes up in a crashed craft pod on an unknown planet, with no memory of how they got there. They are equipped with a flight suit and limited oxygen, and their surroundings are a barren, dark world with strange features like an amethyst sky and glowing moons. As they explore, they hear a booming voice urging them to stay. They encounter a storm, navigate through a canyon, and struggle against an oppressive black cloud that limits their vision. Eventually, they find a crack in a wall and escape into a mysterious cave, where they are drawn to a swirling light. After being pulled into a black lake, they are thrust into a white light, experiencing a dramatic end. In a sudden shift, the story transitions to a woman being rushed to the hospital, where EMTs confirm she has a pulse. Her family, visibly worried, is reassured by her husband, who tells their children that their mother is going to be okay after finding the light again. The scene ends with the ambulance driving off, symbolizing hope and a new beginning as the sun rises.");
                break;
            default:
                System.out.println("Invalid choice.");
        }
        Rating.rate("Fantasy");
	Feedback.fb("Fantasy");
    }
}

class ScienceFiction 
{
    public static void display() 
    {
        System.out.println("\nChoose a story:");
        System.out.println("1. Add Vodka to Taste");
        System.out.println("2. A fight for light");
        int storyChoice=UserChoice.getChoice(2);
        switch (storyChoice) 
	{
            case 1:
                System.out.println("\nHere is your story: \n");
                System.out.println("Valerian, haunted by memories of his friend Roman and their troubled past, faces a difficult journey through Old England in search of Roman, whom he thought he had killed. Roman, now alive but changed, has become a shadow of his former self, with a new identity, Rowan. Val struggles with guilt, responsibility, and the consequences of their fractured bond. After a traumatic mission and the loss of Roman in a cave-in, Val is tasked with investigating rumors of his survival. He eventually finds Rowan, who has endured both physical and emotional scars. Despite the mystery surrounding Rowan's transformation, Val continues to care for him, even sharing a meal that reminds him of Roman, though it’s clear that Rowan is not the same person. The story reflects themes of love, guilt, identity, and redemption, as Val confronts the consequences of his past actions and attempts to come to terms with the man Roman has become.");
                break;
            case 2:
                System.out.println("\nHere is your story: \n");
                System.out.println("Dr. Tavian Solen and his team are conducting an expedition in a cave on Janeri Prime, investigating an ancient phenomenon related to light and vision. They discover a mysterious stone, dubbed Luxium, which emits intense light when touched. Due to its harmful effects on the eyes, the team develops a method to mine it using modified goggles and equipment. However, an accident causes the cave to collapse, resulting in the deaths of most of the team, including Dr. Tavian. Surviving members—Eris, Lucan, Linus, and Darius—make their way to Ja-Katris, but Darius is revealed to have betrayed the team by orchestrating the cave collapse to cover up his involvement in Lord Magnus Atris's plot. Darius is killed by Linus, and the remaining survivors decide to expose Lord Magnus's evil intentions to the public. After surrendering to the authorities, they confront Magnus, who plans to use the Luxium to control Ja-Katris through blackmail. However, the team had already planted a recording device in the Luxium, which broadcasts Magnus's confession to the public. As the people of Ja-Katris revolt, Magnus faces the consequences of his actions.");
                break;
            default:
                System.out.println("Invalid choice.");
        }
        Rating.rate("Sci-Fi");
	Feedback.fb("Sci-Fi");
    }
}

class Mystery 
{
    public static void display() 
    {
        System.out.println("\nChoose a story:");
        System.out.println("1. Seven Hundred and Thirty Days");
        System.out.println("2. Pendulum Swing");
        int storyChoice=UserChoice.getChoice(2);
        switch (storyChoice) 
	{
            case 1:
                System.out.println("\nHere is your story: \n");
                System.out.println("In this intense, emotionally charged narrative, Jackie reflects on her past as she revisits her childhood home with her brother, Perry, two years after an accident that almost killed him. The house, now a shell of its former self, triggers painful memories of their parents' death in a fire and Jackie's battle with alcoholism. As they walk through the ruins, Jackie is confronted with distorted memories, including a fabricated image of a happy childhood that is shattered when she realizes the truth about her parents' neglect and her own role in the accident. The memories blur the lines between reality and hallucination, revealing that Perry's presence has been a constant anchor for Jackie, even as she struggles with guilt and self-forgiveness. In the climax, the house and the memories distort violently, leading to a fall that transitions into the present: Jackie in a hospital room, still grappling with her trauma. Dr. Lasko, her therapist, appears in the simulations as Perry, helping her confront the painful truth. Despite her progress, Jackie feels uncertain about her freedom from the past, but she is determined to continue facing her memories, even if it means never fully forgiving herself.");
                break;
            case 2:
                System.out.println("\nHere is your story: \n");
                System.out.println("\nHere is your story: \n");
                System.out.println("At an elegant party, a mysterious man arrives unnoticed, moving with an eerie ease that captivates some guests, especially the lady with the pink boa and Ms. Vanderox, a wealthy and sharp-minded socialite. The man, dressed in an off-the-rack suit and bowler hat, subtly interacts with the guests but remains elusive, as if blending in without truly belonging. He dances with a striking girl in a red dress, mesmerizing the crowd with their perfect synchronization. As the night progresses, the man disappears, leaving behind only traces of his presence, including Ms. Vanderox's missing bangles. The girl in the red dress follows, her actions hinting at an ominous departure. The man’s bowler hat, found later with a cryptic message inside—“Time well spent”—remains the only tangible reminder of his brief, mysterious visit, leaving guests to wonder about the true nature of his visit and the secrets he left behind");
                break;
            default:
                System.out.println("Invalid choice.");
        }
        Rating.rate("Mystery");
	Feedback.fb("Mystery");
    }
}

class Horror 
{
    public static void display() 
    {
        System.out.println("\nChoose a story:");
        System.out.println("1. Venus Buried");
        System.out.println("2. THAT THING ON THE HILL");
        int storyChoice=UserChoice.getChoice(2);
        switch (storyChoice)
	{
            case 1:
                System.out.println("\nHere is your story: \n");
                System.out.println("The story follows a girl, Bette, who feels consumed by guilt after her best friend, Adeline Marcus, dies in a tragic accident. Adeline suffocates in a fire caused by some boys, and though the boys claim it was an accident, Bette cannot shake the feeling that she could have prevented it. Four days after Adeline’s death, Bette exhumes her body and brings it home. As Bette struggles with her own grief, the decaying corpse of Adeline speaks to her, offering cryptic and unsettling thoughts on love, life, and death. Bette is consumed by guilt and confusion, torn between wanting to remember Adeline as she once was and confronting the horror of the present. Eventually, she realizes that she cannot escape her feelings of remorse, and the relationship with the dead Adeline remains complicated and unresolved. The story explores themes of loss, guilt, and the haunting nature of memory and regret.");
                break;
            case 2:
                System.out.println("\nHere is your story: \n");
                System.out.println("A person recounts their experience with their best friend, David Castro, who was genetically engineered by scientists using a plant species from Yemen. The scientists manipulated the plant's DNA to resemble human genes and created a hybrid being—a human-child and a tree-like organism. David grew up with neglectful parents, particularly his cold mother, Maria, who treated him as an experiment. Over time, David struggled with his identity, feeling disconnected from his humanity and increasingly drawn to the tree. Eventually, David spirals into despair and mental instability, leading to his tragic end. David's body is found in the woods, gruesomely displayed like a sacrificial figure, and his soul is believed to have been consumed by the tree, which grows in size and dominates the landscape after his death. The narrator feels immense guilt for not having done more to help David and for enabling the toxic environment that led to his downfall. The tree, now a malevolent force, symbolizes the twisted science and neglect that shaped David's life, and the narrator believes they have condemned their friend to an eternal torment.");
                break;
            default:
                System.out.println("Invalid choice.");
        }
        Rating.rate("Horror");
	Feedback.fb("Horror");
    }
}

class Rating 
{
    public static void rate(String g) 
    {
        System.out.println("\nDid you enjoy the story? Please rate it (1 to 5):");
        int rating=UserChoice.getChoice(5);
        System.out.println("Thank you for rating the " + g + " story with a score of " + rating + ".");
    }
}

class Feedback 
{
    public static void fb(String genre) 
    {
	Scanner sc=new Scanner(System.in);
        System.out.println("\nDid you enjoy the story? Please give feedback:");
        String feedback=sc.nextLine();
        System.out.println("Thank you for the valuable feedback.");
    }
}

class UserChoice 
{
    public static int getChoice(int num) 
    {
        int ch=-1;
        while(true) 
	{
            try 
	    {
                System.out.print("Enter your choice: ");
                ch=Integer.parseInt(StoryReader.sc.nextLine());
                if (ch>=1 && ch<=num) 
		{
                    break;
                } 
	        else 
		{
                    System.out.println("Invalid choice. Please enter a number between 1 and " + num + ".");
                }
            } 
	    catch(NumberFormatException e) 
	    {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }
        return ch;
    }
}
