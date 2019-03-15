
public class TicTacToeLogic {
	
	// Vairiables
	protected char[] board;
	protected char userMarker;
	protected char aiMarker;
	protected char winner;
	protected char currentMarker;
	
	// Constructor
	public TicTacToeLogic(char playerToken, char aiMarker) {
		this.userMarker = playerToken;
		this.aiMarker = aiMarker;
		this.winner = '-';
		//this.board = setBoard();
	}
}
