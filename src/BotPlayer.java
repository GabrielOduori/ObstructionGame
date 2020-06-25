import java.util.Random;

public class BotPlayer extends Player {
	
	private Random rand;
	
	public BotPlayer(String name) {
		super(name);
		rand  = new Random();
	}
	
	
	public int[] nextMove(Board board) {
		int[] move = new int[2];
		do {
			move[0] = rand.nextInt(board.getMaxRow());
			move[1] = rand.nextInt(board.getMaxCol());
		}
		while(board.getSquare(move[0], move[1])!=1);
		return move;
	}

}
