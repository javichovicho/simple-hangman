import java.lang.Math.*;
import java.nio.file.*;
import java.io.*;

public class Hangman{

	private char letter;
	private String word;
	private String displayedWord;
	private String hiddenWord;

	public Hangman(){
		word = "";
		displayedWord = "";
	}

	//Reads words from the file hangman.txt
	public String getSecretWord(){

		Path file = Paths.get("C:\\Users\\jagon\\Desktop\\SD\\TextIO\\hangman.txt");
		InputStream input = null;

		try{
			input = Files.newInputStream(file);
			BufferedReader reader = new
			BufferedReader(new InputStreamReader(input));
			String s = "";

			s = reader.readLine();

			String[] secretWords = s.split(" ");

			input.close();

			int ran = (int)(Math.random()*6);
			word = secretWords[ran];


		}
		catch (IOException e){
			System.out.println(e);
		}
		return word;
	}

	//Checks the number of characters and displays them as *
	public String hideWord(String word){
		StringBuffer strBuff = new StringBuffer();
		for(int i = 0; i < word.length(); i++){
			strBuff.append('*');
		}
		hiddenWord = strBuff.toString();
		return hiddenWord;
	}

	//Checks the character input by the user
	public String playGame(char letter){
		StringBuffer strBuff = new StringBuffer();
		for (int i = 0; i < hiddenWord.length(); i++){
			strBuff.append(hiddenWord.charAt(i));
		}

		for(int i = 0; i < word.length(); i++){
			if(word.charAt(i) == letter){
				strBuff.setCharAt(i, letter);		//changes a specific character
			}else{									//in the string buffer
				strBuff.setCharAt(i, hiddenWord.charAt(i));
			}
		}

		hiddenWord = strBuff.toString();
		return hiddenWord;
	}
}