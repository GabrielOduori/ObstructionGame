
public class Main {

	public static void main(String[] args) {
		// announces the game and instructs any human players how to input their move
		IO.printWelcome();
		// create two human players called Anna and Tom
		Player anna = new HumanPlayer("Anna");
		Player tom = new HumanPlayer("Tom");
		// Anna and Tom play each other on a 6 by 6 board
		Game game = new Game(6, 6, anna, tom);
		game.playGame();
		// create an instance of my random bot
		Player stupidbot = new BotPlayer("Mr. Random");
		// tom now plays an 8 by 10 game against the bot
		Game game2 = new Game(8, 10, tom, stupidbot);
		game2.playGame();
	}
}
