
public class Board {
	private int maxRow;
	private int maxCol;
	private int[][] board;

	// Constructor to initialise empty board.

	public Board(int maxRow, int maxCol) {
		this.maxRow = maxRow;
		this.maxCol = maxCol;
		this.board = new int[maxRow][maxCol];
	}

	// access row size.
	public int getMaxRow() {
		return maxRow;
	}

	// get column size
	public int getMaxCol() {
		return maxCol;
	}

	// get board entry
	public int getSquare(int row, int col) {
		return board[row][col];
	}

	/*
	 * 0 represents empty square 1 represents coloured square 2 represents square
	 * occupied by player 1 3 represents square occupied by player 2
	 */

	// Colour square row, col on board
	public void colorSquare(int row, int col) {
		// Check range and that square is empty,if not, do nothing
		if (0 <= row && row < maxRow && 0 <= col && col < maxCol && board[row][col] == 0) {
			board[row][col] = 1;
		}
	}

	public int play(int currentPlayer, int row, int col) {
		// check if input is out of range.
		if (row < 0 || row >= maxRow || col < 0 || col >= maxCol) {
			// the range is invalid
			return 0;
		}
		// Check if square is occupied or colored.
		else if (board[row][col] > 0) {
			return 1;
		} else {
			// move into the square
			board[row][col] = 1 + currentPlayer;
			// Color row above.
			for (int i = 0; i < 3; i++) {
				colorSquare(row - 1, col - 1 + i);
			}

			// colour left right
			colorSquare(row, col - 1);
			colorSquare(row, col + 1);

			// colour row below
			for (int i = 0; i < 3; i++) {
				colorSquare(row + 1, col - 1 + i);
			}
			// code for completed move
			return 2;
		}
	}

	// check if board is full.
	public boolean isFull() {
		for (int i = 0; i < maxRow; i++) {
			for (int j = 0; j < maxCol; j++) {
				if (board[i][j] == 0) {
					// found empty square return false.
					return false;
				}
			}
		}
		// else not found empty square
		return true;
	}

}
