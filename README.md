# simple-hangman

Here's the exercise.

An application program that plays the Hangman game will be written. The program contains a
secret word. The user has 10 chances to guess the letters, which make up the word. Each time
the user guesses a correct letter an asterix should be replaced by that letter.
For example
 * * * * * * *
becomes
 T * * * * * *
After the T has been guessed correctly.

(i) Give an algorithm to outline the logic of this application. 

(ii) Develop the getInput() method, which allows the user to input a letter.

(iii) Develop a method playGame(), which compares the letter the user has entered to
the secret word and replaces the asterix with any correct guesses.

(iv) Modify the program so that it contains another method getSecretWord(). This
method should declare and create an array of strings. The random() method from
the Math class should be used to select a random number. This number should
correspond to an element of the String array. The String at the selected index
should be used as the secret word. Also, show how you would construct the String
of asterix, which corresponds to the secret word.

The application also uses a text file with words which it reads from.
The location of this file has to changed in order for the application to work.
