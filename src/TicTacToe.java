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
			
			
			boolean chooseToken = false;
			char playerToken = scan.next().charAt(0);;
			char aiToken = 'O';
			while(chooseToken) {
				if (playerToken == 'o' || playerToken == 'O' ) {
					aiToken = 'X';
					chooseToken = true;
				}else if (playerToken == 'x' || playerToken == 'X' ) {
					aiToken = 'O';
					chooseToken = true;
				}else {
					chooseToken = false;
				}
			
			}
			
			TicTacToeLogic game = new TicTacToeLogic(playerToken, aiToken);
			AI ai = new AI();
			
			//Setup Game
			System.out.println();
			System.out.println("Enter a index where you would like to put your token.");
			TicTacToeLogic.printIndexBoard();
			System.out.println();
			
			//Play Game
			while (game.gameOver().equals("Continue playing!")) {
				if (game.currentMarker == game.userMarker) {
					//User Turn
					System.out.println("Its your turn! Enter a token location.");
					int spot = scan.nextInt();
					while (!game.playTurn(spot)) {
						System.out.println("ReEnter, " + spot + " spot is already taken.");
						spot = scan.nextInt();
					}
					System.out.println("You picked " + spot + "spot!");
				}else {
					//AI Turn
					System.out.println("Its my turn!");
					int aiSpot = ai.pickSpot(game);
					game.playTurn(aiSpot);
					System.out.println("I placed my token at index: " + aiSpot);
				}
				System.out.println();
				game.printBoard();
			}
			System.out.println(game.gameOver());
			System.out.println();
			
			//Replay?
			System.out.println("Do you wanna play again?");
			System.out.println("Enter Y if you do!");
			char response = scan.next().charAt(0);
			doYouWannaPlay = (response == 'Y' || response == 'y');
			System.out.println();
		}

	}

}
