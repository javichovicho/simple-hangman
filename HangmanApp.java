import javax.swing.JOptionPane;

public class HangmanApp{

	public static void main(String[] args){

		String word;
		String input;
		char inputChar;
		String hiddenWord;
		String ans = "Yes";

		Hangman myHangman = new Hangman();

		while(ans.equalsIgnoreCase("Yes")){

			int tries = 0;

			boolean condition = true;

			word = myHangman.getSecretWord();

			System.out.println(myHangman.hideWord(word));

			while(tries < 10 && condition == true){

				input = JOptionPane.showInputDialog(null,
					"Please enter a letter");
				inputChar = input.charAt(0);

				hiddenWord = myHangman.playGame(inputChar);
				System.out.println(myHangman.playGame(inputChar));

				if(hiddenWord.equals(word)){
					condition = false;
					JOptionPane.showMessageDialog(null, "Well done !");
				}

				tries++;
			}
			if(tries == 10){
				JOptionPane.showMessageDialog(null, "You've run out of tries...");
			}
			ans = JOptionPane.showInputDialog("Play again? Yes or No");
		}
	}
}