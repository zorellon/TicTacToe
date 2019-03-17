
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
	    this.board = setBoard();
	}
	
	public static char[] setBoard() {
		char[] board = new char[9];
		for (int i = 0; i < board.length; i++) {
			board[i] = '-';
		}
		return board;
	}
	
	public boolean playTurn(int spot) {
		boolean isValid = withinRange(spot) && !isSpotTaken(spot);
		if(isValid ) {
			board[spot-1] = currentMarker;
			currentMarker = (currentMarker == userMarker) ? aiMarker : userMarker;
			
		}
		return isValid;
	}
}
