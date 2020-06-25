import java.util.Scanner;

public class HumanPlayer extends Player{
	private Scanner scan;
	
	public HumanPlayer(String name) {
		super(name);
		scan = new Scanner(System.in);//open input stream
	}
	public int[] nextMove(Board boad) {
		int[] move = new int[2];
		//parses human input and converts into integers
		move[0] = scan.nextInt();
		move[1] = scan.nextInt();
		//output human move as tuple
		return move;
}

}
