
public class IO {
	
	// represent individual square as string
	public static String squareToString(int square) {
		// square empty
		if(square == 0) {
			return ".";
		}
		// square colored
		else if(square == 1) {
			return "c";
		}
		// square occupied by player 1
		else if(square == 2) {
			return "X";
		}
		// square occupied by player 2
		else if(square == 3) {
			return "O";
		}
		return "";
	}
	
	// print whole board as matrix
	public static void printBoard(Board board) {
		System.out.println();
		for(int i = 0; i < board.getMaxRow(); i++) {
			System.out.print(i + " ");
			for(int j = 0; j < board.getMaxCol(); j++) {
				System.out.print(squareToString(board.getSquare(i, j)) + " ");
			}
			System.out.println();
		}
		System.out.print("  ");
		for(int j = 0; j < board.getMaxCol(); j++) {
			System.out.print(j + " ");
		}
		System.out.print("\n");
	}
	
	// print welcome message
	public static void printWelcome() {
		System.out.println("\n******************************************");
		System.out.println("WELCOME TO OBSTRUCTION");
		System.out.println("\nEnter i j to place counter on ijth square");
		System.out.println("******************************************");				
	} 

  // announce players
  public static void printPlayers(Player player1, Player player2){
    System.out.println("\n******************************************");
		System.out.println(player1.getName() + " vs " + player2.getName());
		System.out.println("******************************************");	
  }
	
	// ask player to move
	public static void requestMove(Player player) {
		System.out.println("\n" + player.getName() + "'s move:");
	}
	
	// print error message for input out of range
	public static void printRangeError() {
		System.out.println("\nout of range!");
	}
	
	// print error message for square occupied
	public static void printOccupiedError() {
		System.out.println("\nsquare occupied!");
	}
	
	// print winning player
	public static void printWinner(Player player) {
		System.out.println("\n" + player.getName() + " wins!");
	}

}