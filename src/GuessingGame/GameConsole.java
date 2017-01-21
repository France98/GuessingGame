package GuessingGame;

import java.util.Scanner;

/**
 * Interacts with the user.
 * 
 * @author Phanuwatch Luangpradit
 *
 */
public class GameConsole {

	/**
	 * the play method plays a games using input from a user
	 * 
	 * @param game is the name of GuessingGame object.
	 * @return all the result of the game.
	 */
	public void play(GuessingGame game) {
		boolean running = true;
		int num;
		Scanner input = new Scanner(System.in);
		String title = "Guessing Game";
		System.out.println(title);
		System.out.println(game.getHint());
		while (running) {
			System.out.print("your guess? ");
			num = input.nextInt();
			game.guess(num);
			System.out.println(game.getHint());
			if (game.guess(num) == true) {
				break;
			}
			game.setCount();
		}
		System.out.print("You used " + (game.getCount() + 1) + " guesses");
	}
}
