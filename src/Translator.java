import java.util.Scanner;

public class Translator
{
	//Run the main method of this class to use the translator, which uses Scanner to get user input. What I suggest is translate an English phrase to Morse Code first, then use the Morse code output
	//and feed that into the Morse Code to English translator to see if it works. This would be a lot easier and quicker than actually typing a Morse Code phrase. 
	public static void main(String[] args) 
	{	
		Scanner input = new Scanner(System.in);
		while(true)
		{
			System.out.println("Enter 1 for English to Morse Code, 2 for Morse Code to English.");
			int choice = Integer.parseInt(input.nextLine());
			
			if(choice == 1)
			{
				System.out.println("Enter your phrase in English.");
				EnglishToMorseCode.translate(input.nextLine());
			}
			
			if(choice == 2)
			{
				System.out.println("Enter Morse Code string. Delimit letters with | characters, and words with spaces.");
				MorseCodeToEnglish.translate(input.nextLine());
			}
			
			System.out.println("Press ENTER to do another translation, type \"Done\" to exit.");
			String answer = input.nextLine();
			
			if(answer.equalsIgnoreCase("Done"))
			{
				break;
			}
		}
		
		System.out.println("Exiting translator.");
		input.close();
	}
}