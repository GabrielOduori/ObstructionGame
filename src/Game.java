
public class Game {
	private Board board;
	private Player player1;
	private Player player2;

	// define game by board size and two players who will play
	public Game(int rowSize, int colSize,Player player1, Player player2) {
		board = new Board(rowSize, colSize);
		this.player1 = player1;
		this.player2 = player2;
	}

	public void playGame() {
		int currentPlayer = 1, status;
		int[] nextMove;
		IO.printPlayers(player1, player2);
		// main loopp repreent player turn executes as long as game is not won.
		while (!board.isFull()) {
			IO.printBoard(board);
			// Inner loop promps player until a valid input is enetered
			do {
				if (currentPlayer == 1) {
					IO.requestMove(player1);
					nextMove = player1.nextMove(board);
				} else {
					IO.requestMove(player2);
					nextMove = player2.nextMove(board);
				}
				status = board.play(currentPlayer, nextMove[0], nextMove[1]);
				// implemenet move on the board
				if (status == 0) {
					IO.printRangeError();// If an attempt is made to move to an occupied square
				}
				if (status == 1) {
					IO.printOccupiedError();// If an attempt is made to move to an occupied square
				}
			} while (status != 2);
			currentPlayer = 3 - currentPlayer; // turn successful, swap players and repeat loop
		}

		// If loop condition fails, game has been won. Print final board and identify
		// winner
		IO.printBoard(board);
		if (currentPlayer == 1) {
			IO.printWinner(player2);
		} else {
			IO.printWinner(player1);
		}
	}

}
