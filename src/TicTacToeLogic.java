
public class TicTacToeLogic {
	
	// Variables
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
	public boolean withinRange(int number) {
		return number >0 && number < board.length + 1;
	}
	
	public boolean isSpotTaken (int number) {
		return board[number-1] != '-';
	}
	
	public void printBoard() {
		System.out.println();
		for (int i = 0; i < board.length; i++) {
			if (i % 3 == 0 && i != 0) {
				System.out.println();
				System.out.println("-------------------");
			}
			System.out.print("|"+ board[i]);
		}
		System.out.println();
	}
	
	public void printIndexBoard() {
		System.out.println();
		for (int i = 0; i < board.length; i++) {
			if (i % 3 == 0 && i != 0) {
				System.out.println();
				System.out.println("-------------------");
			}
			System.out.print("|"+ (i+1));
		}
		System.out.println();
	}
}
