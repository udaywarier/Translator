//This class defines various alphabets that are used to translate phrases. Down the line, I could add more alphabets to this and have more translation options.
public class Alphabets
{
	protected static final String ENGLISH_ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	
	private static final String MORSE = ".- -... -.-. -.. . ..-. --. .... .. .--- -.- .-.. -- -. --- .--. --.- .-. ... - ..- .-- -..- -.-- --..";
	protected static String[] MORSE_CODE_ALPHABET = MORSE.split(" ");
}