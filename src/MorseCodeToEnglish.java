import java.util.List;
import java.util.ArrayList;

public class MorseCodeToEnglish 
{
	//Morse Code to English is a little more complicated because a letter in Morse Code is usually longer than one character.
	protected static void translate(String answer)
	{
		//I use the getMorseCode() method to turn the formatted Morse Code string into an array of String, where each entry is either a space (which delimits words) or a Morse Code letter. From there, 
		//I just translated the Morse Code string entry by entry.
		StringBuffer morseCodeTranslated = new StringBuffer();
		for(String string : getMorseCode(answer))
		{
			if(string.equals(" "))
			{
				morseCodeTranslated.append(" ");
			}
			
			else
			{
				//Finds the index of the Morse Code alphabet array that corresponds to the current letter. This effectively does the same thing as the String.indexOf() method does, but there is no
				//method for arrays so I just wrote my own.
				int index = 0;
			
				for(int x = 0; x < Alphabets.MORSE_CODE_ALPHABET.length; x++)
				{
					if(Alphabets.MORSE_CODE_ALPHABET[x].equals(string))
					{
						index = x;
						break;
					}
				}
			
				morseCodeTranslated.append(Alphabets.ENGLISH_ALPHABET.substring(index, index + 1));
			}
		}
		
		System.out.println("Your string translated to English is:\n" + morseCodeTranslated + "\n");
	}
	
	//The user enters their Morse Code string with letters delimited by the "|" character and words delimited by spaces. What this method does is loop through this phrase and parse out just the 
	//Morse Code, so that at the end it returns an array with each entry being either a Morse Code character or a space. I use StringBuffers throughout this entire project because they are more
	//efficient for these purposes than Strings are.
	private static String[] getMorseCode(String morseCode)
	{
		List<String> temp = new ArrayList<>();
		
		StringBuffer currentLetter = new StringBuffer();
		for(int x = 0; x < morseCode.length(); x++)
		{
			if(morseCode.substring(x, x + 1).equals("|"))
			{
				temp.add(new String(currentLetter));
				currentLetter.delete(0, currentLetter.length());
			}
			
			else if(morseCode.substring(x, x + 1).equals(" "))
			{
				temp.add(new String(currentLetter));
				temp.add(" " );
				currentLetter.delete(0, currentLetter.length());
			}
			
			else
			{
				currentLetter.append(morseCode.substring(x, x + 1));
				
				if(x == morseCode.length() - 1)
				{
					temp.add(new String(currentLetter));
				}
			}
		}
		
		return temp.toArray(new String[temp.size()]);
	}
}