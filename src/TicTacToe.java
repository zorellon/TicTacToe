import java.util.Scanner;

public class TicTacToe {


	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		boolean doYouWannaPlay = true;
		while (doYouWannaPlay) {
			System.out.println(" Welcome to Tic Tac Toe!"
					+"Are you ready to face the Ai?");
			System.out.println();
			System.out.println("Choose If you would like to be X's or O's by entering it now.");
			char playerToken = scan.next().charAt(0);
			char aiToken;
			if (playerToken == 'o' || playerToken == 'O' ) {
				aiToken = 'X';
			}else if (playerToken == 'x' || playerToken == 'X' ) {
				aiToken = 'O';
			}else {
				aiToken = 'X';
			}
			
			TicTacToeLogic game = new TicTacToeLogic(playerToken,aiToken);
			AI ai = new AI();
			
			//Setup Game
			System.out.println();
			System.out.println("Enter a index where you would like to put your token.");
			TicTacToeLogic.printIndexBoard();
			System.out.println();
			
			
			
		}
		

	}

}
