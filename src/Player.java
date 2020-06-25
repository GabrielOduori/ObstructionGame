
public abstract class Player {
	private String name;
	
	public Player(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	} 
	
	
	//to be implemented by extension of an abstract class e.g by taking
	// user input or running an AI algorithm
	
	abstract int[] nextMove(Board board);

}
