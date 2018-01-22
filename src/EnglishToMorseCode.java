public class EnglishToMorseCode
{
	//The English to Morse Code translator was relatively easy, basically I use a StringBuffer for the Morse Code phrase because that is more efficient than concatenating Strings, and translated
	//the phrase one character at a time. I reference alphabets from the Alphabets class, which is where both the English and Morse Code alphabets are stored.
	protected static void translate(String answer)
	{		
		StringBuffer englishTranslated = new StringBuffer();
		for(int x = 0; x < answer.length(); x++)
		{
			englishTranslated.append(answer.substring(x, x + 1).equals(" ") ? " " 
									: Alphabets.MORSE_CODE_ALPHABET[Alphabets.ENGLISH_ALPHABET.indexOf(String.valueOf(answer.substring(x, x + 1)).toUpperCase())] 
									+ (x == answer.length() - 1 ? "" :  (answer.substring(x + 1, x + 2).equals(" ") ? "" : "|")));
		}
		
		System.out.println("Your phrase translated to Morse Code, with letters delimited by | characters and words delimited by spaces, is:\n" + englishTranslated + "\n");
	}
}