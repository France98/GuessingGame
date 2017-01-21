package GuessingGame;

import java.util.Random; // for random numbers

/**
 * Game of guessing a secret number.
 * @author Phanuwatch Luangpradit
 */
public class GuessingGame {

	private int upperBound;
	private int secret;
	private String hint;
	private int count;

	/**
	 * Initialize a new game.
	 * 
	 * @param upperbound
	 *            is the max value for the secret number (>1).
	 */
	public GuessingGame(int upperBound) { // this is a constructor
		/* properties of a guessing game */
		this.upperBound = upperBound;
		this.secret = getRandomNumber(upperBound);
		this.hint = "I'm thinking of a number between 1 and " + upperBound;
	}

	/**
	 * Create a random number between 1 and limit.
	 * 
	 * @param limit
	 *            is the upper limit for random number
	 * @return a random number between 1 and limit (inclusive)
	 */
	private int getRandomNumber(int limit) {
		long seed = System.currentTimeMillis();
		Random rand = new Random(seed);
		return rand.nextInt(limit) + 1;
	}

	/**
	 * Return a hint based on the most recent guess.
	 * 
	 * @return hint based on most recent guess
	 */
	public String getHint() {
		return this.hint;
	}

	/**
	 * set a new hint
	 * @param the hint that help player to win.
	 */
	public void setHint(String hint) {
		this.hint = hint;
	}

	/**
	 * send how many time that palyer guesses
	 * @return a guesses that player summited.
	 */
	public int getCount() {
		return count;
	}

	/**
	 * count that how many time that play summited
	 */
	public void setCount() {
		count++;
	}

	/**
	 * check that the number that player guess is correct or not.
	 * @param number
	 * @return return that the answer is true or false and give the hint.
	 */
	public boolean guess(int number) {
		if (number == secret) {
			this.hint = "Correct. The secret is " + number;
			return true;
		} else if (number < secret) {
			this.hint = "Sorry, your guess is too small";
			return false;
		} else {
			this.hint = "Sorry, your guess is too large";
			return false;
		}
	}
}
